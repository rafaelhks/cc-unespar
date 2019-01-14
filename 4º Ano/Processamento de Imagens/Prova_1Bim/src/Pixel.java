/**
 *
 * @author Rafael
 */
public class Pixel {
    
    private int posH, posW, type;
    private double[] RGB;
    
    public Pixel(int H, int W, double[] rgb){
        this.posH = H;
        this.posW = W;
        this.RGB = rgb;
        this.type = 0;
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
    
    public void setType(int type){
        this.type = type;
    }
    
    public double[] getRGB(){
        return this.RGB;
    }
    
    public void setRGB(double[] RGB){
        this.RGB = RGB;
    }
    
    public double[] YIQtoRGB(double[] YIQ){
        return new double[] {((1*YIQ[0])+(0.956*YIQ[1])+(0.620*YIQ[2])),
                            ((1*YIQ[0])-(0.272*YIQ[1])-(0.647*YIQ[2])),
                            ((1*YIQ[0])-(1.108*YIQ[1])+(1.705*YIQ[2]))};    
    }
    
    public double[] HSVtoRGB(double[] HSV){
        double H, f,p,q,t;
        
        H = (HSV[0]/60)%6;
        
        f = (HSV[0]/60)-H;
        
        p = HSV[2]*(1-HSV[1]);
        
        q = HSV[2]*(1-(f*HSV[1]));
        
        t = HSV[2]*(1-(1-f)*HSV[1]);
        
        if(H==0) return new double[]{HSV[2]*255,t*255,p*255};
        else if(H==1) return new double[]{q*255,HSV[2]*255,p*255};
        else if(H==2) return new double[]{p*255,HSV[2]*255,t*255};
        else if(H==3) return new double[]{p*255,q*255,HSV[2]*255};
        else if(H==4) return new double[]{t*255,p*255,HSV[2]*255};
        else if(H==5) return new double[]{HSV[2]*255,p*255,q*255};
        
        return null;
    }
    
    public double getIntensidade(){
        double i=0;
        for(double d: this.RGB) i+=d;
        return i/this.RGB.length; 
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
    
    public int type(){
        return this.type;
    }
    
    public void type(int t){
        this.type = t;
    }
    
    @Override
    public String toString(){
        return "Pos: "+this.posH+"x"+this.posW+" RGB: ["+this.RGB[0]+","+this.RGB[1]+","+this.RGB[2]+"]";
    }
}
