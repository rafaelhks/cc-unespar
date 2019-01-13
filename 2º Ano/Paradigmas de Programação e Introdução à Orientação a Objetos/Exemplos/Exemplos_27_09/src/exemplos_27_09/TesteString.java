
package exemplos_27_09;

import java.util.Scanner;


public class TesteString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        char vetor_char[];
        
        System.out.print("Leia uma palavra: ");
        s1 = scan.nextLine();
        
        System.out.println("Tamanho: " + s1.length());
        System.out.println("Caixa-alta: " + s1.toUpperCase());
        
        vetor_char = s1.toCharArray();
        
        for (int i = 0; i < vetor_char.length; i++) {
            System.out.println("Caracter: " + vetor_char[i]);
        }
    
    }
  
}
