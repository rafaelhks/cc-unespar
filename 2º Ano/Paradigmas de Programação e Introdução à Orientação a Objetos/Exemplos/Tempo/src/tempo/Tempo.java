/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempo;

import data.Data;
import hora.Hora;

/**
 * Classe principal para executar o programa.
 * @author fabio
 */
public class Tempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora h1 = new Hora(10, 36, 50);
        Hora h2 = new Hora(38210);
        Data d1 = new Data(10, 11, 2016);
        
        //System.out.println(h1.getHora() + ":" + h1.getMinuto() + ":" + h1.getSegundo());
        
        System.out.println("Hora atual h1: " + h1);
        System.out.println("Tempo em segundos h1: " + h1.convertToSeconds());
        
        System.out.println("Hora atual h2: " + h2);
       
    }
    
}
