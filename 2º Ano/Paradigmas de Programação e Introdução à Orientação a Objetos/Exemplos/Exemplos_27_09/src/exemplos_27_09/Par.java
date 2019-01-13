package exemplos_27_09;

import java.util.Scanner;


public class Par {
    
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("LEIA x: ");
        x = scan.nextInt();
        
        if (x%2 == 0) {
            System.out.println(x + " É NÚMERO PAR");
        }
        else {
            System.out.println(x + " É NÚMERO ÍMPAR");
        }
        
    }
    
}
