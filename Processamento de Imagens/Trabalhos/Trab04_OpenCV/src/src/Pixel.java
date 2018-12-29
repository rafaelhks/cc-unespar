package src;

/**
 *
 * @author Rafael
 */
public class Pixel {
    
    private int posX, posY;
    private double[] RGB;
    
    public Pixel(int posx, int posy, double[] rgb){
        this.posX = posx;
        this.posY = posy;
        this.RGB = rgb;
    }
    
    public int getX(){
        return this.posX;
    }
    
    public int getY(){
        return this.posY;
    }
    
    public double[] getRGB(){
        return this.RGB;
    }
}
