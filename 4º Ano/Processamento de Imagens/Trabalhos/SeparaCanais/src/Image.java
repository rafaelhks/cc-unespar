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

    ArrayList<Pixel> pixels = new ArrayList();
    private String srcImgPath;
    private int type, height, width;
    public static final int COLOR_RGB = 0, COLOR_HSV = 1, COLOR_YIQ = 2,
                     COLOR_GRAY_RGB = 3, COLOR_GRAY_HSV = 4, COLOR_GRAY_YIQ = 5;
    
    public Image(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    public Image sepChannel(int ch, int COLOR_MODE){
        Image img = new Image();
        img.height = this.height;
        img.width = this.width;
        img.type = this.type;
        
        for(Pixel px: this.pixels){
            double c = 0;
            Pixel p = new Pixel(px.getH(), px.getW(), px.getRGB());
            switch (COLOR_MODE) {
                case COLOR_RGB:
                    c = p.getRGB()[ch];
                    double[] newRGB = {0,0,0};
                    newRGB[ch] = c;
                    p.setRGB(newRGB);
                    break;
                case COLOR_HSV:
                    c = p.getHSV()[ch];
                    double[] newHSV = {0,0,0};
                    if(ch==0){
                        newHSV[ch] = (c/Math.PI)*255;
                    }else{
                        newHSV[ch] = c*255;
                    }
                    p.setRGB(newHSV);
                    break;
                case COLOR_YIQ:
                    c = p.getYIQ()[ch];
                    double[] newYIQ = {0,0,0};
                    if(ch==0){
                        newYIQ[ch] = Map(c,0,2.5,0,255);
                    }else{
                        newYIQ[ch] = Map(c,-1,1,0,255);
                    }
                    p.setRGB(newYIQ);
                    break;
                case COLOR_GRAY_RGB:
                    c = p.getRGB()[ch];
                    p.setRGB(new double[]{c,c,c});
                    break;
                case COLOR_GRAY_HSV:
                    c = p.getHSV()[ch];
                    if(ch==0){
                        c = Map(c,0,360,0,255);
                    }else{
                        c = Map(c,0,1,0,255);
                    }
                    p.setRGB(new double[]{c,c,c});
                    break;
                case COLOR_GRAY_YIQ:
                    c = p.getYIQ()[ch];
                    if(ch==0){
                        c = Map(c,0,2.5,0,255);
                    }else{
                        c = Map(c,-1,1,0,255);
                    }
                    p.setRGB(new double[]{c,c,c});
                    break;
                default:
                    break;
            }
            img.put(p);
        }
        return img;
    }  
    
    public double Map(double x, double in_min, double in_max, double out_min, double out_max)
    {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }
    
    public BufferedImage getBuffImg(){
        BufferedImage img = new BufferedImage(this.width, this.height, BufferedImage.TYPE_3BYTE_BGR);
        for(Pixel p : this.pixels){
            if(p.getH()>=0 && p.getW()>=0 && p.getH()<this.height && p.getW()<this.width){
                double[] pRGB = p.getRGB();
                int rgb = new java.awt.Color((int)pRGB[2], (int)pRGB[1], (int)pRGB[0]).getRGB();
                img.setRGB(p.getW(), p.getH(), rgb);
            }
        }
        return img;
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
    
    public Mat getMat(){
        Mat m = new Mat(height, width, type);
        for (int i = 0; i < m.height(); i++) {
            for (int j = 0; j < m.width(); j++) {
                m.put(i, j, new double[]{0,0,0});
            }
        }
        for(Pixel p: pixels){
            if(p.getH() >= 0 && p.getW()>=0){
                m.put(p.getH(), p.getW(), p.getRGB());
            }            
        }
        return m;
    }
    
    public ArrayList<Pixel> MatToArrayList(Mat src){
        ArrayList<Pixel> copy = new ArrayList();
        for (int i = 0; i < src.height(); i++) {
            for (int j = 0; j < src.width(); j++) {
                copy.add(new Pixel(i, j, src.get(i, j)));
            }
        }
        return copy;
    } 
    
    public void put(Pixel p){
        this.pixels.add(p);
    }
    
    public String getSrcImgPath(){
        return srcImgPath;
    }
    
    public boolean loadImage(String srcImgPath){
        try{
            Mat src = Imgcodecs.imread(srcImgPath);
            this.pixels = MatToArrayList(src);
            this.height = src.height();
            this.width = src.width();
            this.type = src.type();
            this.srcImgPath = srcImgPath;
            return true;
        }catch(CvException | java.lang.NullPointerException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean saveImage(String savePath){
        try{
            return Imgcodecs.imwrite(savePath, getMat());
        }catch(CvException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
}
    
    