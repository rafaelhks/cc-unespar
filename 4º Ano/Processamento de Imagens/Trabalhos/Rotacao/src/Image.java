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
public class Image {
    ArrayList<Pixel> original = new ArrayList();
    ArrayList<Pixel> pixels = new ArrayList();
    private String srcImgPath, originalExt;
    private int type, height, width, translateH, translateW;
    
    public Image(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public Mat Rotate(double angulo){
        int centroW = width/2;
        int centroH = height/2;
        int maiorH = height, maiorW = width, menorH = 0, menorW = 0;
        double a = Math.toRadians(angulo); 
        
        for(Pixel p: original){
            int H = p.getH()-centroH, W = p.getW()-centroW;
                
            int newW = (int)((W*Math.cos(a))-(H*Math.sin(a)));
            int newH = (int)((W*Math.sin(a))+(H*Math.cos(a)));

            newW+=centroW;
            newH+=centroH;
            
            p.setPos(newH, newW);
        }
        
        return getMat();
    }
    
    public Mat Translate(int H, int W){
        for(Pixel p: pixels){
            p.setPos(p.getH()+H, p.getW()+W);
        }
        return getMat();
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
    
    public BufferedImage getBuffImg(){
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for(Pixel p : original){
            if(p.getH()>=0 && p.getW()>=0 && p.getH()<height && p.getW()<width){
                int rgb = new java.awt.Color((int)p.getRGB()[2], (int)p.getRGB()[1], (int)p.getRGB()[0]).getRGB();
                img.setRGB(p.getW(), p.getH(), rgb);
            }
        }
        return img;
    }
    
    public ArrayList<Pixel> MatToArrayList(Mat src){
        ArrayList<Pixel> copia = new ArrayList();
        for (int i = 0; i < src.height(); i++) {
            for (int j = 0; j < src.width(); j++) {
                copia.add(new Pixel(i, j, src.get(i, j)));
            }
        }
        return copia;
    }
    
    public Mat getMat(){
        Mat m = new Mat(height, width, type);
        for (int i = 0; i < m.height(); i++) {
            for (int j = 0; j < m.width(); j++) {
                m.put(i, j, new double[]{0,0,0});
            }
        }
        for(Pixel p: pixels){
            if(p.getH() >= 0 && p.getW()>=0 
               && p.getH() < this.height && p.getW() < this.width){
                m.put(p.getH(), p.getW(), p.getRGB());
            }            
        }
        return m;
    }
    
    public void loadFile(String srcImgPath){
        try{
            Mat src = Imgcodecs.imread(srcImgPath);
            this.pixels = MatToArrayList(src);
            this.original = pixels;
            this.type = src.type();
            this.height = src.height();
            this.width = src.width();
            this.srcImgPath = srcImgPath;
            this.originalExt = srcImgPath.substring(srcImgPath.lastIndexOf("."));
        }catch(CvException | java.lang.NullPointerException ex){
            System.out.println(ex.toString());
        }
    }
    
    public boolean saveFile(){
        try{
            srcImgPath = srcImgPath.replace(originalExt, "_Edit"+originalExt);
            return Imgcodecs.imwrite(srcImgPath, getMat());
        }catch(CvException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
        
    public String getSrcImgPath(){
        return srcImgPath;
    }
}

