
package exemplos_27_09;

import java.util.Scanner;


public class Media {
    public static void main(String[] args) {
        double vetor[], soma=0;
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tamanho do vetor: ");
        n = scan.nextInt();
        
        vetor = new double[n];
        
        for (int i=0; i<vetor.length; i++) {
            System.out.print("Valor " + i + ": ");
            vetor[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        System.out.println("\nMédia: " + (soma/n));
    }
}
