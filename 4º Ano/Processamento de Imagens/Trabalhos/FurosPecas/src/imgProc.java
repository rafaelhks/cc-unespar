/**
 *
 * @author Rafael
 */
public class imgProc {
    
    public static double[] WHITE_RGB = {255,255,255}, BLACK_RGB = {0,0,0};
    
    public static Image Binarize(Image src, int limiar){
        Image newImage = new Image(src.height(), src.width(), src.type());
        
        for (int i = 0; i < src.height(); i++) {
            for (int j = 0; j < src.width(); j++) {
                if(src.get(i, j).getIntensidade()>=limiar){ newImage.put(i, j, WHITE_RGB); }
                else{ newImage.put(i, j, BLACK_RGB); }
            }
        }
        
        return newImage;
    }
    
    public static int HoleCount(Image src, double[] holeRGB){
        int furos= 0;
        double[] BGRGB = BLACK_RGB;
        if(holeRGB==BLACK_RGB) BGRGB = WHITE_RGB;
        
        Image newImg = Image.getCopy(src);
        
        for (int i = 0; i < newImg.height(); i++) {
            for (int j = 0; j < newImg.width(); j++) {
                if(Preencher(newImg, i, j, 0, holeRGB, BGRGB)>0) furos++;
            }
        }
        System.out.println("Furos: "+(furos-1));
        return furos-1;
    }
    
    public static int Preencher(Image src, int H, int W, int cont, double[] atualRGB, double[] newRGB){
        if(src.get(H,W)!=null){
            if(src.get(H,W).matchColor(atualRGB)){
                src.get(H, W).setRGB(newRGB);
                cont++;
                Preencher(src, H-1, W-1, cont, atualRGB, newRGB);
                Preencher(src, H-1, W, cont, atualRGB, newRGB);
                Preencher(src, H-1, W+1, cont, atualRGB, newRGB);
                Preencher(src, H, W+1, cont, atualRGB, newRGB);
                Preencher(src, H+1, W+1, cont, atualRGB, newRGB);
                Preencher(src, H+1, W, cont, atualRGB, newRGB);
                Preencher(src, H+1, W-1, cont, atualRGB, newRGB);
                Preencher(src, H, W-1, cont, atualRGB, newRGB);
            }
        }
        return cont;
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