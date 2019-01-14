/**
 *
 * @author Rafael
 */
public class imgProc {
    
    public static void Preencher(Image src, int H, int W, double[] atualRGB, double[] newRGB){
        if(src.get(H,W)!=null){
            if(src.get(H,W).matchColor(atualRGB) && atualRGB!=newRGB){
                src.get(H, W).setRGB(newRGB);
                
                if(H-1>=0 && W-1>=0 && src.get(H-1,W-1).matchColor(atualRGB)){
                    Preencher(src, H-1, W-1, atualRGB, newRGB);
                }
                if(H-1>=0 && src.get(H-1,W).matchColor(atualRGB)){
                    Preencher(src, H-1, W, atualRGB, newRGB);
                }
                if(H-1>=0 && W+1<src.width() && src.get(H-1,W+1).matchColor(atualRGB)){
                    Preencher(src, H-1, W+1, atualRGB, newRGB);
                }
                if(W+1<src.width() && src.get(H,W+1).matchColor(atualRGB)){
                    Preencher(src, H, W+1, atualRGB, newRGB);
                }
                if(H+1<src.height() && W+1<src.width() && src.get(H+1,W+1).matchColor(atualRGB)){
                    Preencher(src, H+1, W+1, atualRGB, newRGB);
                }
                if(H+1<src.height() && src.get(H+1,W).matchColor(atualRGB)){
                    Preencher(src, H+1, W, atualRGB, newRGB);
                }
                if(H+1<src.height() && H-1>=0 && src.get(H+1,W-1).matchColor(atualRGB)){
                    Preencher(src, H+1, W-1, atualRGB, newRGB);
                }
                if(W-1>=0 && src.get(H,W-1).matchColor(atualRGB)){
                    Preencher(src, H, W-1, atualRGB, newRGB);
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