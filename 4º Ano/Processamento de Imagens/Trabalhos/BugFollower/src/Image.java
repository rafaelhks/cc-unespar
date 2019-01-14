/**
 *
 * @author Rafael
 */
public class Image {
    private Pixel[][] pixels;
    private String path;
    private int type, height, width;
    public static final int COLOR_RGB = 0, COLOR_HSV = 1, COLOR_YIQ = 2,
                     COLOR_GRAY_RGB = 3, COLOR_GRAY_HSV = 4, COLOR_GRAY_YIQ = 5;
    private String originalExt;
    
    public Image(String srcFilePath){
        try{
            org.opencv.core.Mat src = org.opencv.imgcodecs.Imgcodecs.imread(srcFilePath);
            MatToArray(src);
            this.height = src.height();
            this.width = src.width();
            this.type = src.type();
            this.path = srcFilePath;
            this.originalExt = this.path.substring(this.path.lastIndexOf("."));
            System.out.println("Res: "+this.height+"x"+this.width);
        }catch(org.opencv.core.CvException | java.lang.NullPointerException ex){
            System.out.println("Falha ao abrir arquivo: "+srcFilePath);
        }
    }
    
    public Image(Pixel[][] pixels, int height, int width, int type, String path){
        this.pixels = pixels;
        this.height = height;
        this.width = width;
        this.type = type;
        this.path = path;
    }
    
    public Image(int height, int width, int type){
        this.height = height;
        this.width = width;
        this.type = type;
        this.pixels = new Pixel[height][width];
    }
    
//    public java.awt.image.BufferedImage getBuffImg(){
//        java.awt.image.BufferedImage img = null;
//        
//        try {
//            org.opencv.core.MatOfByte bytemat = new org.opencv.core.MatOfByte();
//            
//            org.opencv.imgcodecs.Imgcodecs.imencode(".png", this.getMat(), bytemat);
//            
//            byte[] bytes = bytemat.toArray();
//            
//            img = javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(bytes));
//        } catch (java.io.IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        return img;
//    }
    
    public java.awt.image.BufferedImage getBuffImg(){
        java.awt.image.BufferedImage img = 
        new java.awt.image.BufferedImage(this.width, this.height, java.awt.image.BufferedImage.TYPE_INT_BGR);
        
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                Pixel p = this.pixels[i][j];
                int r = (int)p.getRGB()[0];
                int g = (int)p.getRGB()[1];
                int b = (int)p.getRGB()[2];
                if(p.getH()>=0 && p.getW()>=0 && p.getH()<this.height && p.getW()<this.width){
                    img.setRGB(p.getW(),p.getH(), new java.awt.Color(b,g,r).getRGB());
                }
            }
        }
        return img;
    }
    
    public org.opencv.core.Mat getMat(){
        org.opencv.core.Mat m = new org.opencv.core.Mat(this.height, this.width, this.type);
        for (int i = 0; i < m.height(); i++) {
            for (int j = 0; j < m.width(); j++) {
                m.put(i, j, new double[]{0,0,0});
            }
        }
        for(Pixel[] ps: this.pixels){
            for(Pixel p: ps){
                if(p!=null && p.getH() >= 0 && p.getW()>=0){
                    m.put(p.getH(), p.getW(), p.getRGB());
                }            
            }
        }
        return m;
    }
    
    public final void MatToArray(org.opencv.core.Mat src){
        pixels = new Pixel[src.height()][src.width()];
        for (int i = 0; i < src.height(); i++) {
            for (int j = 0; j < src.width(); j++) {
                pixels[i][j]= new Pixel(i, j, src.get(i, j));
            }
        }
    } 
    
    public void put(int h, int w, Pixel p){
        if(h>=0 && w>=0 && h<this.height && w<this.width) this.pixels[h][w] = p;
    }
    
    public void put(int h, int w, double[] rgb){
        if(h>=0 && w>=0 && h<this.height && w<this.width) this.pixels[h][w] = new Pixel(h,w,rgb);
    }
    
    public Pixel get(int h, int w){
        if(h>=0 && h<this.height && w>=0 && w<this.width){
            return this.pixels[h][w];
        }
        return null;
    }
    
    public Pixel[][] getPixels(){
        return this.pixels;
    }
    
    public String path(){
        return path;
    }
    
    public int height(){
        return this.height;
    }
    
    public int width(){
        return this.width;
    }
    
    public int type(){
        return this.type;
    }
    
    public int total(){
        return pixels.length;
    }
    
    public void setPixels(Pixel[][] p){
        this.pixels = p;
    }
    
    public void setSize(int h, int w){
        this.height = h;
        this.width = w;
    }
    
    public String getExtension(){
        return this.originalExt;
    }
}