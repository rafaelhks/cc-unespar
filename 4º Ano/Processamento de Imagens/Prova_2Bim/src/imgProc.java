
/**
 *
 * @author Rafael
 */
public class imgProc {
    public static double[] WHITE_RGB = {255, 255, 255}, BLACK_RGB = {0,0,0};
    
    public static void SobelCircle(Image src, int H, int W, int r){
        Image circle = new Image((H+r)-(H-r), (W+r)-(W-r), src.type());
        
        for (int h = H - r ; h <= H; h++){
            for (int w = W - r ; w <= W; w++){
                if ((h - H)*(h - H) + (w - W)*(w - W) <= r*r) {
                    int hIn = H - (h - H);
                    int wIn = W - (w - W);
                    // (h, w), (h, wIn), (hIn, w), (hIn, wIn) estão dentro da circunferência
                    if(src.get(h, w)!=null) circle.put(h-H+r, w-W+r, src.get(h, w).getRGB());
                    if(src.get(h, wIn)!=null) circle.put(h-H+r, wIn-W+r, src.get(h, wIn).getRGB());
                    if(src.get(hIn, w)!=null) circle.put(hIn-H+r, w-W+r, src.get(hIn, w).getRGB());
                    if(src.get(hIn, wIn)!=null) circle.put(hIn-H+r, wIn-W+r, src.get(hIn, wIn).getRGB());
                }
            }
        }

        circle = Sobel(circle, 50);
        
        for (int i = 0; i < circle.height(); i++) {
            for (int j = 0; j < circle.width(); j++) {
                if(circle.get(i, j)!=null && !circle.get(i, j).matchColor(new double[]{0,255,0})){
                    src.get(i+H-r, j+W-r).setRGB(circle.get(i, j).getRGB());
                }
            }
        }
    }
    
    public static Image Sobel(Image src, int limiar){
        Image res = new Image(src.height(), src.width(), src.type());
    
        for (int h = 0; h < src.height(); h++) {
            for (int w = 0; w < src.width(); w++) {
                double R1 = 0, R2 = 0, result;
                
                if(src.get(h, w)!=null){
                    if(h>0 && w>0 && h<src.height()-1 && w<src.width()-1){
                        if(src.get(h-1, w-1)!=null) R1+=src.get(h-1, w-1).getIntensidade()*(-1);
                        if(src.get(h-1, w)!=null) R1+=src.get(h-1, w).getIntensidade()*(-2);
                        if(src.get(h-1, w+1)!=null) R1+=src.get(h-1, w+1).getIntensidade()*(-1);
                        if(src.get(h+1, w+1)!=null) R1+=src.get(h+1, w+1).getIntensidade()*1;
                        if(src.get(h+1, w)!=null) R1+=src.get(h+1, w).getIntensidade()*2;
                        if(src.get(h+1, w-1)!=null) R1+=src.get(h+1, w-1).getIntensidade()*1;

                        if(src.get(h-1, w-1)!=null) R2+=src.get(h-1, w-1).getIntensidade()*(-1);
                        if(src.get(h, w-1)!=null) R2+=src.get(h, w-1).getIntensidade()*(-2);
                        if(src.get(h+1, w-1)!=null) R2+=src.get(h+1, w-1).getIntensidade()*(-1);
                        if(src.get(h-1, w+1)!=null) R2+=src.get(h-1, w+1).getIntensidade()*1;
                        if(src.get(h, w+1)!=null) R2+=src.get(h, w+1).getIntensidade()*2;
                        if(src.get(h+1, w+1)!=null) R2+=src.get(h+1, w+1).getIntensidade()*1;

                        result = Math.sqrt(Math.pow(R1, 2)+Math.pow(R2, 2));
                    }else{
                        result = src.get(h, w).getIntensidade();
                    }

                    if(result>limiar){
                        res.put(h,w,new Pixel(h,w,new double[]{255,255,255}));
                    }else{
                        res.put(h,w,new Pixel(h,w,new double[]{0,0,0}));
                    }
                }
            }
        }
        
        return res;
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