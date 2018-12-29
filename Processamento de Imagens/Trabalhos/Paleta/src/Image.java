import java.util.List;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;
import java.util.Collections;
import java.util.Comparator;
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
    List<Pixel> pixels = new ArrayList();
    private String srcImgPath;
    private int type, height, width;
    public static final int COLOR_RGB = 0, COLOR_HSV = 1, COLOR_YIQ = 2,
                     COLOR_GRAY_RGB = 3, COLOR_GRAY_HSV = 4, COLOR_GRAY_YIQ = 5;
    private String originalExt;
    
    public Image(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public Mat Paleta(int size){
        List<List<Pixel>> grupos = new ArrayList();
        List<Pixel> paleta = new ArrayList();
        
        List<Pixel> grupo = new ArrayList();
        for (Pixel p: pixels){
            double H = p.getHSV()[0];
//            if(H<0) H+=360;
            if(H>0){
                grupo.add(p);
            }else{
                if(!grupo.isEmpty()){
                    grupos.add(grupo);
                    grupo = new ArrayList();
                }
            }
        }
        
        //Ordena os grupos por tamanho (Decrescente)
        Collections.sort(grupos, new Comparator(){
            @Override
            public int compare(Object t, Object t1) {
                List<Pixel> p1 = (List<Pixel>)t, p2 = (List<Pixel>)t1;
                if(p1.size()>p2.size()) return -1;
                if(p1.size()<p2.size()) return 1;
                return 0;
            }
        });
        
        //Percorre grupos e adiciona a média na paleta
        for(int i=0; i<size; i++){
            List<Pixel> grup = grupos.get(i);
            int posMedia = grup.size()/2;
            paleta.add(grup.get(posMedia));
        }
        
        //Ordena a paleta em ordem decrescente
        //Collections.sort(paleta, Collections.reverseOrder());

        Mat newMat = new Mat(100, size*100, this.type);
        
        //Adiciona na Mat até size
        for (int w = 0; w < newMat.width(); w+=100) {
            Pixel p = paleta.get(w/100);
            System.out.println(p.getHSV()[0]);
            for (int i = 0; i < 100; i++) {
                for (int k = w; k < w+100; k++) {
                    newMat.put(i, k, p.getRGB());
                }
            }
        }
        return newMat;
    }
    
    public Mat paleta2(int max){
        List<Integer> colors = new ArrayList();
        List<Pixel> paleta = new ArrayList();
        
        for(Pixel p: pixels){
            if(colors.size()<max){
                int r = (int)p.getRGB()[0];
                int g = (int)p.getRGB()[1];
                int b = (int)p.getRGB()[2];
                colors.add(new java.awt.Color(b,g,r).getRGB());
            }
        }
        
        for (Integer i: colors) {
            java.awt.Color c = new java.awt.Color(i);
            paleta.add(new Pixel(0,0, new double[]{c.getBlue(), c.getGreen(), c.getRed()}));
        }
        
        Mat img = new Mat(25, 25*max, this.type);
        int i=0;
        for(Pixel p: this.pixels){
            for (int h = 0; h < 25; h++) {
                for (int w = i; w < i+25; w++) {
                    img.put(h, w, p.getRGB());
                }
            }
            i+=25;
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