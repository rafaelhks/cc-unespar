
package exemplos_27_09;

import java.util.Scanner;


public class Bhaskara {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("LEIA a: ");
        a = scan.nextDouble();
        
        System.out.print("LEIA b: ");
        b = scan.nextDouble();
        
        System.out.print("LEIA c: ");
        c = scan.nextDouble();
        
        delta = Math.pow(b, 2) - 4*a*c;
        
        if (delta>0) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("X1 = " + x1 + " e X2 = " + x2);
        }
        else if (delta==0) {
            x1 = x2 = (-b)/(2*a);
            System.out.println("X1 = " + x1 + " e X2 = " + x2);
        }
        else {
            System.out.println("NÃO POSSUI RAÍZES REAIS");
        }
        
    }
}
