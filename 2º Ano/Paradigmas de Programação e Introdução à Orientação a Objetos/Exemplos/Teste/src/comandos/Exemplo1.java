/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandos;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Exemplo1 {
    
    public static int Soma(int a, int b) {
        int s;
        s = a+b;
        return s;
    }
    
    public static void main(String[] args) {
        int a, b, s;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Leia a: ");
        a = scanner.nextInt();
        
        System.out.print("Leia b: ");
        b = scanner.nextInt();
        
        s = Soma(a,b);
        
        System.out.println("Soma: " + s);
        
        if (s>0) {
            System.out.println("Soma positiva");
        } 
        else {
            System.out.println("Soma negatvia");
        }
        
    }
}
