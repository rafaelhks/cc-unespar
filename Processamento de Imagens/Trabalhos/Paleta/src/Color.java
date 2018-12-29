
import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Color implements Comparable{
    private int Count;
    private double[] RGB;
    
    public Color(double[] rgb){
        this.RGB = rgb;
        Count = 1;
    }
    
    public void AddCount(){
        this.Count++;
    }
    
    public void setCount(int c){
        this.Count = c;
    }
    
    public int getCount(){
        return this.Count;
    }
    
    public double[] getRGB(){
        return this.RGB;
    }
    
    public double[] getHSV(){
        double r1 = this.RGB[0]/255 , g1 = this.RGB[1]/255, b1 = this.RGB[2]/255;
        double cmax = Math.max(Math.max(r1, g1), b1),
               cmin = Math.min(Math.min(r1, g1), b1),
               delta = cmax-cmin;
        double H = 0, S = 0, V = cmax;
        
        //H
        if(delta==0){
            H = 0;
        }else if(cmax == r1){
            H = 60*(((g1-b1)/delta)%6);
        }else if(cmax == g1){
            H = 60*(((b1-r1)/delta)+2);
        }else if(cmax == b1){
            H = 60*(((r1-g1)/delta)+4);
        }
        //S
        if(cmax != 0){
            S = delta/cmax;
        }

        return new double[]{H,S,V};
    }
    
    public double[] getYIQ(){
        return new double[] {((0.299*this.RGB[0])+(0.587*this.RGB[1])+(0.114*this.RGB[2])),
                             ((0.596*this.RGB[0])-(0.275*this.RGB[1])-(0.321*this.RGB[2])),
                             ((0.212*this.RGB[0])-(0.523*this.RGB[1])+(0.311*this.RGB[2]))};
    }
    
    public void setRGB(double[] rgb){
        this.RGB = rgb;
    }
    
    public Color sum(Color c){
        double[] rgb = this.RGB;
        for (int i = 0; i < this.RGB.length; i++) {
            rgb[i] += c.getRGB()[i];
        }
        return new Color(rgb);
    }
    
    @Override
    public boolean equals(Object o){
        Color c = (Color)o;
        
        return c.getHSV()[0]==this.getHSV()[0];
    }
    
    @Override
    public String toString(){
        return "Color RGB: "+Arrays.toString(this.RGB)+" - Count: "+this.Count;
    }

    @Override
    public int compareTo(Object t) {
        Color c = (Color)t;
        if(c.getHSV()[0]>this.getHSV()[0]) return -1;
        if(c.getHSV()[0]<this.getHSV()[0]) return 1;
        return 0;
    }
}
