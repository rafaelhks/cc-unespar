package Classes;
import java.math.BigInteger;
import java.util.ArrayList;
/**
 *
 * @author rafael
 */
public class Soma {
    private BigInteger bin1;
    private BigInteger bin2;
    

    public void Soma(String num1, String num2){
//      this.bin1 = new BigInteger(num1);
//      this.bin2 = new BigInteger(num2);
        String[] binario1 = new String[num1.length()];
        String[] binario2 = new String[num2.length()];
        String binresult = "";
        int soma;
        int resto = 0;
        
        for (int i = 0; i < num1.length(); i++) {
            binario1[i] = (Character.toString(num1.charAt(i)));
        }
        for (int i = 0; i < num2.length(); i++) {
            binario2[i] = (Character.toString(num1.charAt(i)));
        }
        
        for (String a: binario2) {
            System.out.println(a+"\n");
        }
        
        for (String a: binario1) {
            for (String b: binario2) {
                System.out.println("Num 1: "+a);
                System.out.println("Num 2: "+b);
                System.out.println("Resto: "+resto);
                
                soma = Integer.parseInt(a)+Integer.parseInt(b)+resto;
                
                if (soma == 0) {
                    binresult += "0"; 
                    resto = 0;
                }else if (soma == 1) {
                    binresult += "1";
                    resto = 0;
                }else if (soma == 2) {
                    binresult += "0";
                    resto = 1;
                }
                System.out.println("Soma: "+soma);
            }          
        }
        System.out.println(binresult);
        
    }
}
