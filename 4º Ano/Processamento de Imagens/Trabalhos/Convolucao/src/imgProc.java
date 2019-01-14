import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class imgProc {
    public static final int COLOR_RGB = 0, COLOR_GRAY_RGB = 1;
    
    public static Image Sobel(Image src, int limiar){
        Image img = new Image(src.height(), src.width(), src.type());
        
        for (int h = 0; h < src.height(); h++) {
            for (int w = 0; w < src.width(); w++) {
                double R1 = 0, R2 = 0, result;
                
                if(h>0 && w>0 && h<src.height()-1 && w<src.width()-1){
                    R1+=src.get(h-1, w-1).getIntensidade()*(-1);
                    R1+=src.get(h-1, w).getIntensidade()*(-2);
                    R1+=src.get(h-1, w+1).getIntensidade()*(-1);
                    R1+=src.get(h+1, w+1).getIntensidade()*1;
                    R1+=src.get(h+1, w).getIntensidade()*2;
                    R1+=src.get(h+1, w-1).getIntensidade()*1;
                    R1+=src.get(h, w).getIntensidade()*0;
                    R1+=src.get(h, w-1).getIntensidade()*0;
                    R1+=src.get(h, w+1).getIntensidade()*0;

                    R2+=src.get(h-1, w-1).getIntensidade()*(-1);
                    R2+=src.get(h, w-1).getIntensidade()*(-2);
                    R2+=src.get(h+1, w-1).getIntensidade()*(-1);
                    R2+=src.get(h-1, w+1).getIntensidade()*1;
                    R2+=src.get(h, w+1).getIntensidade()*2;
                    R2+=src.get(h+1, w+1).getIntensidade()*1;
                    R2+=src.get(h-1, w).getIntensidade()*0;
                    R2+=src.get(h, w).getIntensidade()*0;
                    R2+=src.get(h+1, w).getIntensidade()*0;

                    result = Math.sqrt(Math.pow(R1, 2)+Math.pow(R2, 2));
                }else{
                    result = src.get(h, w).getIntensidade();
                }

                if(result>limiar){
                    img.put(h,w,new Pixel(h,w,new double[]{255,255,255}));
                }else{
                    img.put(h,w,new Pixel(h,w,new double[]{0,0,0}));
                }
            }
        }
        
        return img;
    }
    
    public static Image Media(Image src, int r, int color_type){
        Image img = new Image(src.height(), src.width(), src.type());
        if(r<=0) return null;
        
        for (int h = 0; h < src.height(); h++) {
            for (int w = 0; w < src.width(); w++) {
                double R=0, G=0, B=0, TOM=0, divisor = ((h+r+1)-(h-r))*((w+r+1)-(w-r));
                
                for (int i = h-r; i <= h+r; i++) {
                    for (int j = w-r; j <= w+r; j++) {
                        if(i<src.height() && i>=0 && j<src.width() && j>=0){
                            if(color_type == COLOR_RGB){
                                R+=src.get(i, j).getRGB()[0]/divisor;
                                G+=src.get(i, j).getRGB()[1]/divisor;
                                B+=src.get(i, j).getRGB()[2]/divisor;
                            }else if(color_type == COLOR_GRAY_RGB){
                                TOM+=src.get(i, j).getIntensidade()/divisor;
                            }
                        }else {
                            divisor--;
                        }
                    }
                }
                
                if(color_type == COLOR_RGB){
                    img.put(h,w, new Pixel(h,w,new double[]{R,G,B}));
                }else if(color_type == COLOR_GRAY_RGB){
                    img.put(h,w, new Pixel(h,w,new double[]{TOM,TOM,TOM}));
                }        
            }
        }
        
        return img;
    }
    
    public static Image Mediana(Image src, int r, int color_type){
        Image img = new Image(src.height(), src.width(), src.type());
        if(r<=0) return null;
        
        for (int h = 0; h < src.height(); h++) {
            for (int w = 0; w < src.width(); w++) {
                List<Pixel> nbh = new ArrayList();

                for (int i = h-r; i <= h+r; i++) {
                    for (int j = w-r; j <= w+r; j++) {
                        if(i<src.height() && i>=0 && j<src.width() && j>=0){
                            nbh.add(src.get(i, j));
                        }
                    }
                }

                java.util.Collections.sort(nbh, new java.util.Comparator(){
                    @Override
                    public int compare(Object t, Object t1) {
                        Pixel p0 = (Pixel)t, p1 = (Pixel)t1;
                        if(color_type == COLOR_RGB){
                            if(p0.getHSV()[0]>p1.getHSV()[0]) return -1;
                            if(p0.getHSV()[0]<p1.getHSV()[0]) return 1;
                        }else if(color_type == COLOR_GRAY_RGB){
                            if(p0.getIntensidade()>p1.getIntensidade()) return -1;
                            if(p0.getIntensidade()<p1.getIntensidade()) return 1;
                        }
                        return 0;
                    }
                });
                
                img.put(h, w, new Pixel(h,w, nbh.get(nbh.size()/2).getRGB()));
            }
        }
        
        return img;
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