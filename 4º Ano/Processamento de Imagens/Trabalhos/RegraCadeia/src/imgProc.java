/**
 *
 * @author Rafael
 */
public class imgProc {
    public static double[] WHITE_RGB = {255, 255, 255}, BLACK_RGB = {0,0,0};
    
    public static String Cadeia(Image src, int H, int W,double[] RGB){
        String Num = "";
        if(src.get(H, W).matchColor(RGB)) return "A cor do contorno é a mesma da cor procurada.";
        
        double[] srcRGB = src.get(H, W).getRGB();
        //src.get(H, W).setRGB(RGB);
        int count = 0;
        
        Pointer p = new Pointer(0, H, W);
        
        do{
            if(p.look(src)!=null && !p.look(src).matchColor(srcRGB)){
                p.look(src).setRGB(RGB);
            }
            if(p.next(src)==null || !p.next(src).matchColor(srcRGB)){
                p.rotate();
            }
            p.go();
            
            Num+=p.getDir();
            //SUPER DISPOSITIVO ANTI LOOP ETERNO
            count++;
            if(count>=10*src.total()) return "LOOP\n"+Num;
            //SUPER DISPOSITIVO ANTI LOOP ETERNO
        }while(p.atual(src) != src.get(H, W));
        
        return Num;
    }
    
    public static void Binarize(Image src, int limiar){
        for (int i = 0; i < src.height(); i++) {
            for (int j = 0; j < src.width(); j++) {
                if(src.get(i, j).getIntensidade()>=limiar){ src.get(i, j).setRGB(WHITE_RGB); }
                else{ src.get(i, j).setRGB(BLACK_RGB); }
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