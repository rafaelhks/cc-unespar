package Classes;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
/**
 *
 * @author Rafael
 */
public class Main {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        //Localização das imagens de entrada e saída
        String srcImgPatch = "srcImg.png";
        String gsImgPatch = "grayScaleImg.png";
        String binImgPatch = "binaryImg.png";
        
        //Lê imagem fonte
        Mat srcImg = Imgcodecs.imread(srcImgPatch);
        System.out.println("Imagem lida de: "+srcImgPatch);
        
        //Escala de cinza
        Mat gsImg = grayScale(srcImg);
        System.out.println("Processamento de cor concluído.");
        
        //Binarização
        Mat binImg = Binarize(srcImg);
        System.out.println("Binarização concluída.");
        
        //Inverção
//        Mat invImg = Invert(srcImg);
//        System.out.println("Inverção concluída.");
        
        //Salva as imagems processadas a partir das matrizes
        Imgcodecs.imwrite(gsImgPatch, gsImg);
        System.out.println("Imagem em escala de cinza salva em: "+gsImgPatch);
        Imgcodecs.imwrite(binImgPatch, binImg);
        System.out.println("Imagem com binarização salva em: "+binImgPatch);
//        Imgcodecs.imwrite("invertedImg.png", invImg);
//        System.out.println("Imagem com binarização salva em: "+binImgPatch);
    }
    
    private static Mat grayScale(Mat srcImg){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat gsImg = new Mat(srcImg.rows(), srcImg.cols(), srcImg.type());
        
        //Percorre a matriz da imagem
        for (int i = 0; i < srcImg.rows(); i++) {
            for (int j = 0; j < srcImg.cols(); j++) {
                double[] rgb = srcImg.get(i, j); //Vetor RGB de cada ponto
                double[] bw = new double[rgb.length]; //Novo vetor bw
                double c = (rgb[0]+rgb[1]+rgb[2])/3; //Calculo da intensidade
                bw[0] = bw[1] = bw[2] = c;
                gsImg.put(i, j, bw);
            }
        }
        return gsImg;
    }
    
    private static Mat Binarize(Mat srcImg){
        //Cria uma nova matriz Mat com as mesmas características de srcImg
        Mat binImg = new Mat(srcImg.rows(), srcImg.cols(), srcImg.type());
        
        int alpha = 100;
        
        //Percorre a matriz da imagem
        for (int i = 0; i < srcImg.rows(); i++) {
            for (int j = 0; j < srcImg.cols(); j++) {
                double[] rgb = srcImg.get(i, j); //Vetor RGB de cada ponto
                double[] bin = new double[rgb.length]; //Novo vetor bin
                double c = (rgb[0]+rgb[1]+rgb[2])/3; //Calculo da intensidade
                if(c<alpha){
                    bin[0] = bin[1] = bin[2] = 0;
                }
                if(c>alpha){
                    bin[0] = bin[1] = bin[2] = 255;
                }
                binImg.put(i, j, bin);
            }
        }
        return binImg;
    }
    
//    private static Mat Invert(Mat srcImg){
//        //Cria uma nova matriz Mat com as mesmas características de srcImg
//        Mat binImg = new Mat(srcImg.rows(), srcImg.cols(), srcImg.type());
//        
//        //Percorre a matriz da imagem
//        for (int i = 0; i < srcImg.rows(); i++) {
//            for (int j = 0; j < srcImg.cols(); j++) {
//                double[] rgb = srcImg.get(i, j); //Vetor RGB de cada ponto
//                double[] bin = new double[rgb.length]; //Novo vetor bin
//                bin[0] = 255-rgb[0]; 
//                bin[1] = 255-rgb[1];
//                bin[2] = 255-rgb[2];
//                binImg.put(i, j, bin);
//            }
//        }
//        return binImg;
//    }
}
