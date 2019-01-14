package src;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public myImgProc(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    public Mat Invert(){
        //Percorre a matriz da imagem
        for (int i = 0; i < srcImg.rows(); i++) {
            for (int j = 0; j < srcImg.cols(); j++) {
                double[] oldRGB = srcImg.get(i, j); //Vetor RGB de cada ponto
                double[] newRGB = new double[oldRGB.length]; //Novo vetor rgb
                
                for(int k=0; k<oldRGB.length ; k++){
                    newRGB[k] = 255-oldRGB[k];
                }
                
                srcImg.put(i, j, newRGB);
            }
        }
        return srcImg;
    }
    
    public double[] toYIQ(double[] RGB){
        double[] YIQ = {((0.299*RGB[0])+(0.587*RGB[1])+(0.114*RGB[2])),
                        ((0.596*RGB[0])-(0.275*RGB[1])-(0.321*RGB[2])),
                        ((0.212*RGB[0])-(0.523*RGB[1])+(0.311*RGB[2]))};
        return YIQ;
    }
    
    public double[] toRGB(double[] YIQ){
        double[] RGB = {((1*YIQ[0])+(0.956*YIQ[1])+(0.620*YIQ[2])),
                        ((1*YIQ[0])-(0.272*YIQ[1])-(0.647*YIQ[2])),
                        ((1*YIQ[0])-(1.108*YIQ[1])+(1.705*YIQ[2]))};
        return RGB;
    }
    
    public Mat HistogramColor(){
        Mat equalImg = new Mat(srcImg.rows(), srcImg.cols(), srcImg.type());
        double[][][] matYIQ = new double[srcImg.height()][srcImg.width()][3];
        
        int N = srcImg.rows()*srcImg.cols(); //quantidade de pixels na imagem
        int L = 255; //nivel máximo de cor o YIQ
        double[] colors = new double[L+1];
        
        //Separa informações de rks e nks
        for (int i = 0; i < srcImg.height(); i++) {
            for (int j = 0; j < srcImg.width(); j++) {
                double[] yiq = toYIQ(srcImg.get(i, j));
                matYIQ[i][j] = yiq;
                double rk = yiq[0]; //intensidade rk do pixel
                
                colors[(int)rk]++;
            }
        }
        
        //Probabilidade de nivel de cinza
        for (int i = 0; i <= L; i++) {
            colors[i]/=N;
        }
        
        //Sk
        for (int i = 1; i <= L; i++) {
            colors[i]+=colors[i-1];
        }
        
        for (int i = 0; i < srcImg.height(); i++) {
            for (int j = 0; j < srcImg.width(); j++) {
                double[] yiq = matYIQ[i][j];
                double cor = colors[(int)yiq[0]]*L; 
                
                double[] newYIQ = {cor, yiq[1], yiq[2]};
                double[] rgb = toRGB(newYIQ);
                
                equalImg.put(i, j, rgb);
            }
        }
        
        return equalImg;
    }
    
    public Mat HistogramGray(){
        Mat equalImg = new Mat(srcImg.rows(), srcImg.cols(), srcImg.type());
        
        int N = srcImg.rows()*srcImg.cols(); //quantidade de pixels na imagem
        int L = 255; //nivel máximo de cinza
        double[] tons = new double[L+1];
        
        //Separa informações de rks e nks
        for (int i = 0; i < srcImg.height(); i++) {
            for (int j = 0; j < srcImg.width(); j++) {
                double[] rgb = srcImg.get(i, j);

                double rk = 0; //intensidade rk do pixel
                //calculo de intensidade
                for(double d: rgb){
                    rk+=d;
                }
                rk/=rgb.length;
                
                tons[(int)rk]++;
            }
        }
        System.out.print(";");
        for (int i = 0; i < 256; i++) {
            System.out.print(i+";");
        }
        System.out.println("");
        
        for(int i=0; i<tons.length; i++){
            if(tons[i]>0){
                System.out.print(Double.toString(tons[i]/N).replaceAll("\\.", ",")+";");
                for (int j = 0; j < i-1; j++) {
                    System.out.print(";");
                }
                System.out.println(Double.toString(tons[i]).replaceAll("\\.", ",")+";");
            }
        }
        
        
        //Probabilidade de nivel de cinza
        for (int i = 0; i <= L; i++) {
            tons[i]/=N;
        }
        
        //Sk
        for (int i = 1; i <= L; i++) {
            tons[i]+=tons[i-1];
        }
        
        for (int i = 0; i < srcImg.height(); i++) {
            for (int j = 0; j < srcImg.width(); j++) {
                double[] rgb = srcImg.get(i, j);
                double tom = 0; //intensidade rk do pixel
                //calculo de intensidade
                for(double d: rgb){
                    tom+=d;
                }
                tom/=rgb.length;
                
                double[] newRGB = { tons[(int)tom]*L, tons[(int)tom]*L, tons[(int)tom]*L };
                
                equalImg.put(i, j, newRGB);
            }
        }
        
        return equalImg;
    }
    
    public BufferedImage MatToBuffImg(Mat srcImg){
        BufferedImage img = null;
        
        try {
            MatOfByte bytemat = new MatOfByte();
            
            Imgcodecs.imencode(".png", srcImg, bytemat);
            
            byte[] bytes = bytemat.toArray();
            
            img = ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (IOException ex) {
            Logger.getLogger(myImgProc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return img;
    }
    
    public void openFile(String srcImgPath){
        try{
            srcImg = Imgcodecs.imread(srcImgPath);
            System.out.println("Image Width = "+srcImg.cols());
            System.out.println("Image Height = "+srcImg.rows());
            this.srcImgPath = srcImgPath;
        }catch(CvException | java.lang.NullPointerException ex){
            System.out.println(ex.toString());
        }
    }
    
    public boolean saveFile(String savePatch){
        try{
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
