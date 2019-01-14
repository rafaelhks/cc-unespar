package Classes;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
/**
 *
 * @author Rafael Francisco Ferreira
 * Atividade de Processamento de Imagens 02/1 e 02/2
 */
public class Main {
    private Mat srcImg;
    private final String srcImgPatch;
    
    public Main(String srcImgPatch){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        srcImg = Imgcodecs.imread(srcImgPatch);
        if(srcImg.empty()){
            System.out.println("Imagem não encontrada em: "+srcImgPatch);
        }else{
            System.out.println("Imagem aberta: "+srcImgPatch);
        }
        this.srcImgPatch = srcImgPatch;
    }
    
    public Mat zoomInQuad(int fator){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat zoomInImg = new Mat(srcImg.rows()*fator, srcImg.cols()*fator, srcImg.type());
        
        //Percorre a matriz da imagem
        for (int i = 0; i < srcImg.rows(); i++) {
            for (int j = 0; j < srcImg.cols(); j++) {
                double[] rgb = srcImg.get(i, j);

                //Matriz de pixels que serão pintados
                for (int k = 0; k < fator; k++) {
                    for (int l = 0; l < fator; l++) {
                        zoomInImg.put((i*fator)+k, (j*fator)+l, rgb);
                    }
                }
            }
        }
        srcImg = zoomInImg;
        return zoomInImg;
    }
    
    public Mat zoomOutQuad(int fator){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat zoomOutImg = new Mat(srcImg.rows()/fator, srcImg.cols()/fator, srcImg.type());
        
        //Percorre a matriz da imagem
        for (int i = 0; i < srcImg.rows(); i+=fator) {
            for (int j = 0; j < srcImg.cols(); j+=fator) {
                double[] rgb = srcImg.get(i, j);
                //Matriz de pixels que serão pintados
                zoomOutImg.put((i/fator), (j/fator), rgb);
            }
        }
        srcImg = zoomOutImg;
        return zoomOutImg;
    }
    
    public Mat zoomInLinear(int fator){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat zoomInImg = new Mat(srcImg.rows()*fator, srcImg.cols()*fator, srcImg.type());
        //Percorre a matriz da imagem
        //Novos pontos por linha
        for (int i = 0; i < srcImg.rows(); i++) {
            for (int j = 0; j < srcImg.cols()-1; j++) {
                //RGB do ponto à esquerda
                double[] rgbP0 = srcImg.get(i, j);
                //RGB do ponto à direita
                double[] rgbP1 = srcImg.get(i, j+1);
                //novo RGB que preencherá os demais entre os dois
                double[] newRGB = { (rgbP0[0]+rgbP1[0])/2
                                   ,(rgbP0[1]+rgbP1[1])/2
                                   ,(rgbP0[2]+rgbP1[2])/2};
                
                //preenche os novos pontos 
                //Preenche primeiro ponto
                zoomInImg.put(i*fator, j*fator, rgbP0);
                //Preenche pontos entre o primeiro e o ultimo
                for (int l = 1; l < fator; l++) {
                    zoomInImg.put(i*fator, (j*fator)+l, newRGB);
                }
                //Preenche ultimo ponto
                zoomInImg.put(i*fator, (j*fator)+fator, rgbP1);
            }
        }
        
        //Preenche novos pixels por coluna
        for (int i = 0; i < zoomInImg.rows()-fator; i+=fator) {
            for (int j = 0; j < zoomInImg.cols(); j++) {
                //RGB do ponto à esquerda
                double[] rgbP0 = zoomInImg.get(i, j);
                //RGB do ponto à direita
                double[] rgbP1 = zoomInImg.get(i+fator, j);
                //novo RGB que preencherá os demais entre os dois
                double[] newRGB = { (rgbP0[0]+rgbP1[0])/2
                                   ,(rgbP0[1]+rgbP1[1])/2
                                   ,(rgbP0[2]+rgbP1[2])/2};
                
                //Preenche novos pixels entre rgbP0 e rgbP1 com newRGB
                for (int l = 1; l <= fator; l++) {
                    zoomInImg.put(i+l, j, newRGB);
                }
            }
        }
        srcImg = zoomInImg;
        return zoomInImg;
    }
    
    public Mat zoomOutLinear(int fator){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat zoomOutImg = new Mat(srcImg.rows()/fator, srcImg.cols()/fator, srcImg.type());
        //Percorre a matriz da imagem
        //Novos pontos por linha
        for (int i = 0; i < srcImg.rows(); i+=fator) {
            for (int j = 0; j < srcImg.cols(); j+=fator) {
                double[][] rgbs = new double[fator][3];
                
                for (int k = 0; k < fator; k++) {
                    for (int l = 0; l < fator; l++) {
                        rgbs[k] = srcImg.get(i+k, j+l);
                    }
                }
                
                double r=0, g=0, b=0;
                
                for (int k = 0; k < rgbs.length; k++) {
                    r+=rgbs[k][0];
                    g+=rgbs[k][1];
                    b+=rgbs[k][2];
                }
                
                double[] newRGB = { (r/rgbs.length)
                                   ,(g/rgbs.length)
                                   ,(b/rgbs.length)};
                
                zoomOutImg.put(i/fator, j/fator, newRGB);
                
            }
        }
        srcImg = zoomOutImg;
        return zoomOutImg;
    }
    
    public BufferedImage MatToBuffImg(Mat srcImg){
        BufferedImage img = null;
        
        try {
            MatOfByte bytemat = new MatOfByte();
            
            Imgcodecs.imencode(".png", srcImg, bytemat);
            
            byte[] bytes = bytemat.toArray();
            
            img = ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return img;
    }

    public Mat getSrcImg() {
        return srcImg;
    }
    
    public boolean saveImage(String savePatch){
        return Imgcodecs.imwrite(savePatch, srcImg);
    }
        
    public static void main(String[] args) {
        new Main("srcImg.png");
    }
}
