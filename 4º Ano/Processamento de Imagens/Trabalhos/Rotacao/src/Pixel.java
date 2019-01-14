/**
 *
 * @author Rafael
 */
public class Pixel {
    
    private int posH, posW;
    private double[] RGB;
    
    public Pixel(int H, int W, double[] rgb){
        this.posH = H;
        this.posW = W;
        this.RGB = rgb;
    }
    
    public int getW(){
        return this.posW;
    }
    
    public int getH(){
        return this.posH;
    }
    
    public void setPos(int h, int w){
        this.posW = w;
        this.posH = h;
    }
    
    public double[] getRGB(){
        return this.RGB;
    }
}
