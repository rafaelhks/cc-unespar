import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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

    private Mat srcImg1, srcImg2, finalImg;
    private final String srcImg1Path = "src/IMG/srcImg1.png", 
                         srcImg2Path = "src/IMG/srcImg2.png";
    
    public myImgProc(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    public Mat Binarize(Mat src){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat binImg1 = new Mat(src.rows(), src.cols(), src.type());
        
        int alpha = 100;
        
        //Percorre a matriz da imagem
        for (int i = 0; i < src.rows(); i++) {
            for (int j = 0; j < src.cols(); j++) {
                double[] rgb = src.get(i, j); //Vetor RGB de cada ponto
                double[] bin = new double[rgb.length]; //Novo vetor bin
                double c = (rgb[0]+rgb[1]+rgb[2])/3; //Calculo da intensidade
                if(c<alpha){
                    bin[0] = bin[1] = bin[2] = 0;
                }
                if(c>alpha){
                    bin[0] = bin[1] = bin[2] = 255;
                }
                binImg1.put(i, j, bin);
            }
        }
        return binImg1;
    }
    
    public Mat OR(){
        Mat newImg = new Mat(srcImg1.height(), srcImg1.width(), srcImg1.type());
        double[] white = {255, 255, 255};
        
        for (int i = 0; i < srcImg1.height(); i++) {
            for (int j = 0; j < srcImg1.width(); j++) {
                if(srcImg1.get(i, j)[0] <= 250 || srcImg2.get(i, j)[0] <= 250){
                    newImg.put(i, j, new double[]{0,0,0});
                }else{
                    newImg.put(i, j, white);
                }
            }
        }
        
        return newImg;
    }
    
    public Mat AND(){
        Mat newImg = new Mat(srcImg1.height(), srcImg1.width(), srcImg1.type());
        double[] white = {255, 255, 255};
        
        for (int i = 0; i < srcImg1.height(); i++) {
            for (int j = 0; j < srcImg1.width(); j++) {
                if(srcImg1.get(i, j)[0] <= 250 && srcImg2.get(i, j)[0] <= 250){
                    newImg.put(i, j, new double[]{0,0,0});
                }else{
                    newImg.put(i, j, white);
                }
            }
        }
        
        return newImg;
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
    
    public void loadFile(){
        try{
            srcImg1 = Binarize(Imgcodecs.imread(srcImg1Path));
            srcImg2 = Binarize(Imgcodecs.imread(srcImg2Path));
        }catch(CvException | java.lang.NullPointerException ex){
            System.out.println(ex.toString());
        }
    }
    
    public boolean saveFile(String savePatch){
        try{
            return Imgcodecs.imwrite(savePatch, finalImg);
        }catch(CvException ex){
            System.out.println(ex.toString());
            return false;
        }
    }

    public Mat getSrcImg1() {
        return srcImg1;
    }

    public Mat getSrcImg2() {
        return srcImg2;
    }
}

