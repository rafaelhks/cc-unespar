
package exemplos_27_09;

import java.util.Scanner;


public class Primo {
    public static void main(String[] args) {
        int n;
        int div=1, cont=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("LEIA n: ");
        n = scan.nextInt();
        
        do {
            if (n%div==0) cont++;
            div++;
        } while(div<=n);
        
        if (cont==2) System.out.println(n + " É PRIMO");
        else System.out.println(n + " NÃO É PRIMO");
    }
}
