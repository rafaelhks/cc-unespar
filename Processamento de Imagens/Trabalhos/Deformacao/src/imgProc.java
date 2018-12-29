
import java.util.List;

/**
 *
 * @author Rafael
 */
public class imgProc {
    
    
    public static void Deform(Image src, Image def, List<Pixel> Vs, List<Pixel> Ws){
        double c1 = 1.0, c2 = 0.0, c3 = 0.0;
        Pixel V1 = Vs.get(0), V2 = Vs.get(1), V3 = Vs.get(2),
              W1 = Ws.get(0), W2 = Ws.get(1), W3 = Ws.get(2);
        
        for (c1 = 1; c1 > 0; c1-=0.002) {
            for (c2 = 0; c2 < 1; c2+=0.001) {
                for (c3 = 0; c3 < 1; c3+=0.001) {
                    if(c1+c2+c3==1){
                        int Vh = (int)((c1*V1.getH())+(c2*V2.getH())+(c3*V3.getH()));
                        int Vw = (int)((c1*V1.getW())+(c2*V2.getW())+(c3*V3.getW()));

                        int Wh = (int)((c1*W1.getH())+(c2*W2.getH())+(c3*W3.getH()));
                        int Ww = (int)((c1*W1.getW())+(c2*W2.getW())+(c3*W3.getW()));
                        
                        def.put(Wh, Ww, new Pixel(Wh, Ww, src.get(Vh, Vw).getRGB()));
                    }
                }
            }
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