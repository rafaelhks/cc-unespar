import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Centroide {
    private final List<Pixel> pontos;
    private double[] RGB;
    
    public Centroide(double[] RGB){
        pontos = new ArrayList<>();
        this.RGB = RGB;
    }
    
    public void Add(Pixel p){
        if(!this.pontos.contains(p)){
            this.pontos.add(p);
        }
    }
    
    public void Remove(int pos){
        this.pontos.remove(pos);
    }
    
    public Pixel Get(int pos){
        return this.pontos.get(pos);
    }
    
    public double[] getRGB(){
        return this.RGB;
    }
    
    public double getDistancia(double pixelRGB[]){
        double R = Math.pow(pixelRGB[0]-this.RGB[0], 2);
        double G = Math.pow(pixelRGB[1]-this.RGB[1], 2);
        double B = Math.pow(pixelRGB[2]-this.RGB[2], 2);
        return Math.sqrt(R+G+B);
    }
    
    public List<Pixel> Group(){
        return this.pontos;
    }
    
    public int GroupSize(){
        return this.pontos.size();
    }
    
    public void calcMedia(){
        double R=0, G=0, B=0;
        
        for (Pixel p: this.pontos) {
            R+=p.getRGB()[0];
            G+=p.getRGB()[1];
            B+=p.getRGB()[2];
        }
        
        this.RGB = new double[]{R/this.pontos.size(),
                                G/this.pontos.size(),
                                B/this.pontos.size()};
    }
}
