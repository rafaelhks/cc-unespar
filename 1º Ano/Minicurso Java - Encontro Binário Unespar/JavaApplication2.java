/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author SALAPROF.06
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual sua idade? ");
        int n = in.nextInt(), mult;
        for (int i = 1; i <= 10; i++) {
            mult = n * i;
            System.out.println("22 x " + i + " = " + mult);
        }
    }
    
}
