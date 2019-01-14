package src;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.CvException;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author Rafael
 */
public class myImgProc {

    private Mat srcImg;
    private String srcImgPath;
    private int translateX = 0, translateY = 0;
    private double angle = 0;
    
    public myImgProc(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    public Mat Translate(int X, int Y){
        Mat transImg = new Mat(srcImg.height(), srcImg.width(), srcImg.type());
        
        translateX += X;
        translateY += Y;
        
        for (int i = 0; i < transImg.height(); i++) {
            for (int j = 0; j < transImg.width(); j++) {
                transImg.put(i, j, new double[]{255,255,255});
            }
        }
        
        for (int i = 0; i <srcImg.height(); i++) {
            for (int j = 0; j < srcImg.width(); j++) {
                if(i+translateY>=0 && j+translateX>=0)
                    transImg.put(i+translateY, j+translateX, srcImg.get(i, j));
            }
        }

        return transImg;
    }
    
    public Mat Rotate(double angulo){
        ArrayList<Pixel> pixels = new ArrayList();
        int newWidth = 0, newHeight = 0;
        this.angle = angulo;
        int centroX = srcImg.width()/2;
        int centroY = srcImg.rows()/2;
        double a = Math.toRadians(angulo);
        
        
        for (int i = 0; i < srcImg.height(); i++) {
            for (int j = 0; j < srcImg.width(); j++) {
                int y = i-centroY, x=j-centroX;
                int newX = (int)Math.round((y*Math.cos(a))-(x*Math.sin(a)));
                int newY = (int)Math.round((y*Math.sin(a))+(x*Math.cos(a)));
                newX+=centroX;
                newY+=centroY;
                
                if(newX>=0 && newY>=0){
                    pixels.add(new Pixel(newX, newY, srcImg.get(i, j)));
                }
                
                if(newX>newHeight){
                    newHeight = newX;
                }
                if(newY>newWidth){
                    newWidth = newY;
                }
            }
        }
        
        Mat newMat = new Mat(newHeight, newWidth, srcImg.type());
        
        for (int i = 0; i < newMat.height(); i++) {
            for (int j = 0; j < newMat.width(); j++) {
                newMat.put(i, j, new double[]{0,0,0});
            }
        }
        
        for (int i = 0; i < pixels.size(); i++) {
            newMat.put(pixels.get(i).getX(), 
                       pixels.get(i).getY(), 
                       pixels.get(i).getRGB());
        }
        
        return newMat;
    }
    
    public BufferedImage MatToBuffImg(Mat srcImg){
        BufferedImage img = null;
        
        try {
            MatOfByte bytemat = new MatOfByte();
            
            Imgcodecs.imencode(".png", srcImg, bytemat);
            
            byte[] bytes = bytemat.toArray();
            
            img = ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return img;
    }
    
    public void openFile(String srcImgPath){
        try{
            srcImg = Imgcodecs.imread(srcImgPath);
            this.srcImgPath = srcImgPath;
        }catch(CvException | java.lang.NullPointerException ex){
            System.out.println(ex.toString());
        }
    }
    
    public boolean saveFile(String savePatch){
        try{
            srcImg = Rotate(angle);
            srcImg = Translate(0,0);
            return Imgcodecs.imwrite(savePatch, srcImg);
        }catch(CvException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
        
    public String getSrcImgPath(){
        return srcImgPath;
    }
}
