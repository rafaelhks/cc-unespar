/**
 *
 * @author Rafael
 */
public class imgProc {
    public static double[] WHITE_RGB = {255, 255, 255}, BLACK_RGB = {0,0,0};
    
    public static String BugFollowerSimples(Image src, int H, int W,double[] RGB){
        String Num = "";
        if(src.get(H, W).matchColor(RGB)) return "A cor inicial é a mesma da cor procurada.\n"
                + "Pode gerar LOOP infinito!";
        
        double[] srcRGB = src.get(H, W).getRGB();
        //src.get(H, W).setRGB(RGB);
        int count = 0;
        
        Pointer p = new Pointer(1, H, W);
        
        do{
            if(p.atual(src)!=null && p.next(src)!=null && p.next(src).matchColor(srcRGB)){
                p.atual(src).setRGB(RGB);
                p.next(src).setRGB(RGB);
                System.out.println("Left");
                p.goLeft();
            }else{
                p.goRight();
                System.out.println("Right");
            }
            System.out.println(p.getDir());
            
            //SUPER DISPOSITIVO ANTI LOOP ETERNO
            count++;
            if(count>=15*src.total()) return "LOOP\n"+Num;
            //SUPER DISPOSITIVO ANTI LOOP ETERNO
        }while(p.next(src) != src.get(H, W) || !p.next(src).matchColor(RGB));
        
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