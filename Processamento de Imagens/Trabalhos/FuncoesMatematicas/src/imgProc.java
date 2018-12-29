
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class imgProc {
    
    public static void DrawCircle(Image src, int a, int b, int r, int nPoints, double angle, double[] RGB){
        angle = Math.PI/angle;
        int oldH = -1, oldW = -1;
        
        for (int i = 0; i < nPoints; i++) {
            int w = (int)(a+r*Math.cos(angle));
            int h = (int)(b+r*Math.sin(angle));
            if(src.get(h, w)!=null && oldH!=-1 && oldW!=-1) {
                src.get(h, w).setRGB(RGB);
            }
            oldH = h;
            oldW = w;
            angle+=Math.PI/angle;
        }
    }
    
    public static void DrawLine(Image src, int Hi, int Wi, int Hf, int Wf, double[] RGB){
        for (int h = Hi; h <= Hf; h++) {
            for (int w = Wi; w <= Wf; w++) {
                src.put(h, w, RGB);
            }
        }
    }
    
    public static void DrawQuad(Image src, int H, int W, int l, double[] RGB){
        for (int h = H; h <= H+l; h++) {
            for (int w = W; w <= W+l; w++) {
                if(src.get(h, w)!=null){
                    src.get(h, w).setRGB(RGB);
                }
            }
        }
    }
    
    public static void DrawTriangle(Image src, int H, int W, int h, double[] RGB){
        src.get(H, W).setRGB(RGB);
        int newW = 1;
        int b = 5;
        
        for (int y = H; y < H+h; y++) {
            for (int x = W-newW/2; x < W+newW/2; x++) {
                if(src.get(y, x)!=null){
                    src.get(y, x).setRGB(RGB);
                }
            }
            DrawLine(src, y, W-newW/2, y, W+newW/2, RGB);
            newW++;
        }
    }
    
    public static void DrawFunction(Image src, List<Integer> pontos, double[] RGB){
        int oldH=-1;
        Collections.reverse(pontos);
        for (int w = 0; w < src.width(); w++) {
            int h=-1;
            for (int i = 0; i < pontos.size(); i++) {
                if(pontos.get(i)!=0){
                    h+=Math.pow((pontos.get(i)*w), i);
                }
            }           
            
//            for (int y = oldH; y < h; y++) {
//                src.put(y, w, RGB);
//            }
            
            DrawLine(src, oldH, w, h, w, RGB);
            oldH = h;
            src.put(h, w, RGB);
        }
    }
    
    public static boolean saveImage(Image image, String path){
        try{
            System.out.println("Salvo em: "+path);
            return org.opencv.imgcodecs.Imgcodecs.imwrite(path, image.getMat());
        }catch(org.opencv.core.CvException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
}