package Classes;

import java.math.BigInteger;

/**
 *
 * @author rafael
 */
public class Booth {
    public String multpnd;
    public String multpdr;
    
    public Booth(int multiplicando, int multiplicador){
            this.multpnd = Integer.toBinaryString(multiplicando); 
            this.multpdr = Integer.toBinaryString(multiplicador); 
            
            Soma s = new Soma();
            s.Soma(this.multpnd, this.multpdr);
            
    }    
}
