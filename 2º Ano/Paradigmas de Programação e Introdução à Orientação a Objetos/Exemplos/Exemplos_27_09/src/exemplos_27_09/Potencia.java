
package exemplos_27_09;

import java.util.Scanner;


public class Potencia {
    public static void main(String[] args) {
        double base, potencia=1;
        int exp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Base: ");
        base = scan.nextDouble();
        
        System.out.print("Expoente: ");
        exp = scan.nextInt();
        
        if (exp>0) {
            while (exp>0) {
                potencia = potencia*base;
                exp--;
            }
        }
        else {
            exp = Math.abs(exp);
            while (exp>0) {
                potencia = potencia*(1/base);
                exp--;
            }
        }
        
        System.out.println("RESULTADO: " + potencia);
    }
}
