import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class imgProc {
    public static final int COLOR_RGB = 0, COLOR_GRAY_RGB = 1;
    
    public static List<Image> sepImage(Image src){
        List<Image> images = new ArrayList();
        int height = src.height()/2;
        int width = src.width()/2;
        //Para imagens com tamanho ímpar
        if(src.height()%2!=0){
            height+=1;
        }
        if(src.width()%2!=0){
            width+=1;
        }

        for (int i = 0; i < src.height(); i+=height) {
            for (int j = 0; j < src.width(); j+=width) {
                Image img = new Image(height, width, src.type());
                for (int h = 0; h < img.height(); h++) {
                    for (int w = 0; w < img.width(); w++) {
                        double rgb[] = {};
                        if(i+h<src.height() && j+w<src.width()){
                            rgb = src.get(i+h, j+w).getRGB();
                        }else if(i+h>=src.height() && j+w<src.width()){
                            rgb = src.get(i, j+w).getRGB();
                        }else if(i+h<src.height() && j+w>=src.width()){
                            rgb = src.get(i+h, j).getRGB();
                        }else if(i+h>=src.height() && j+w>=src.width()){
                            rgb = src.get(i, j).getRGB();
                        }
                        Pixel p = new Pixel(h,w, new double[]{rgb[0], rgb[1], rgb[2]});
                        img.put(h, w, p);
                    }
                }
                images.add(img);
            }
        }
        return images;
    }
    
    public static Image uneImagens(List<Image> images){
        int height = images.get(0).height()*2;
        int width= images.get(0).width()*2;
        
        Image img = new Image(height, width, images.get(0).type());
        int index = 0;
        for (int i = 0; i < height; i+=height/2) {
            for (int j = 0; j < width; j+=width/2) {
                for (int h = 0; h < images.get(index).height(); h++) {
                    for (int w = 0; w < images.get(index).width(); w++) {
                        Pixel p = images.get(index).get(h, w);
                        img.put(i+h, j+w, new Pixel(i+h,j+w,p.getRGB()));
                    }
                }
                index++;
            }
        }
        return img;
    }
    
    public static void sepChannel(Image src, int ch, int COLOR_MODE){
        for(Pixel[] ps: src.getPixels()){
            for(Pixel p: ps){
                double c;
                switch (COLOR_MODE) {
                    case COLOR_RGB:
                        c = p.getRGB()[ch];
                        double[] newRGB = {0,0,0};
                        newRGB[ch] = c;
                        p.setRGB(newRGB);
                        break;
                    case COLOR_GRAY_RGB:
                        c = p.getRGB()[ch];
                        p.setRGB(new double[]{c,c,c});
                        break;
                    default:
                        break;
                }
            }
        }  
    }
    
    public static void HistogramGray(Image src){
        int N = src.height()*src.width(); //quantidade de pixels na imagem
        int L = 255; //nivel máximo de cor o YIQ
        double[] tons = new double[L+1];
        
        //Separa informações de rks e nks
        for(Pixel[] ps: src.getPixels()){
            for(Pixel p: ps){
                tons[(int)p.getIntensidade()]++;
            }
        }
        //Probabilidade de nivel de cinza
        for (int i = 0; i <= L; i++) {
            tons[i]/=N;
        }
        
        //Sk
        for (int i = 1; i <= L; i++) {
            tons[i]+=tons[i-1];
        }
        
        for(Pixel[] ps: src.getPixels()){
            for(Pixel p: ps){
                double cor = tons[(int)p.getIntensidade()]; 
                double[] newRGB = {cor*L, cor*L, cor*L};
                p.setRGB(newRGB);
            }
        }
    }
    
    public static boolean saveImage(Image image, String path){
        try{
            if(path.lastIndexOf(".")==-1){
                path+="_Edit.png";
            }
            return org.opencv.imgcodecs.Imgcodecs.imwrite(path, image.getMat());
        }catch(org.opencv.core.CvException ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public static double Map(double x, double in_min, double in_max, double out_min, double out_max)
    {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }
}
