/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bim;
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class main {

    public static void main(String[] args) {
        
        EntradaDeCinema entrada = new EntradaDeCinema();
        int rpt;
        Scanner scan = new Scanner(System.in);
        
        Data nascimento_cliente = new Data(25, 3, 1997);
        
        Menu();
        rpt = scan.nextInt();
        
        while (rpt == 1){
            Clean();
            System.out.println("\n*CINEMA*");
            System.out.println("Sala: ");
            entrada.setSala(scan.nextInt());
            System.out.println("Valor: ");
            entrada.setValor(scan.nextFloat());
            System.out.println("\n*DATA*");
            System.out.println("Dia: ");
            entrada.setDia(scan.nextInt());
            System.out.println("Mes: ");
            entrada.setMes(scan.nextInt());
            System.out.println("Ano: ");
            entrada.setAno(scan.nextInt());
            System.out.println("\n*HORA*");
            System.out.println("Hora: ");
            entrada.setHora(scan.nextInt());
            System.out.println("Minuto: ");
            entrada.setMinuto(scan.nextInt());
            System.out.println("Segundo: ");
            entrada.setSegundo(scan.nextInt());

            entrada.calculaDesconto(nascimento_cliente);            
            //entrada.calculaDesconto(nascimento_cliente, 7777);
            entrada.calculaDescontoHorario();
            
            Clean();
            System.out.println(entrada.toString());
            Menu();
            rpt = scan.nextInt();
            Clean();
        }
        
    }

    public static void Menu(){      
        System.out.println("\n*MENU*");
        System.out.println("1 - Nova Entrada.");
        System.out.println("0 - Sair.");
        System.out.println();
    }
    
    public static void Clean(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
}
