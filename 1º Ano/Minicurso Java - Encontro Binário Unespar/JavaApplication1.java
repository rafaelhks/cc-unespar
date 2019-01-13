/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author SALAPROF.06
 */
public class JavaApplication1 {
    //final static String NOME = "Rafael"; //Crio a string NOME
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        final String NOME = "Rafael";//Crio a string
//        int idade = 18;
//        String semValor, varTeste, nome, sobrenome, nomecompleto;
//        varTeste = "1";
//        semValor = "teste " + varTeste;
//        nome = "Rafael";
//        sobrenome = "Ferreira";
//        nomecompleto = nome + " " + sobrenome; 
//        
//        System.out.println("Olá Mundo! \n" + NOME + ", Idade: " + idade); //Escreve o texto concatenado com a string na tela
//        System.out.println("String semValor: " + semValor);
//        System.out.println("Nome: " + nomecompleto);
        
          //Laços de repetição
//        System.out.println("Repetição usando for: ");
//        for (int i = 0; i <= 10; i++){
//            System.out.println("numero " + i);
//        }
//        
//        int i = 0;
//        System.out.println("Repetição usando while: ");
//        while (i <= 10) {
//            System.out.println("numero " + i);
//            i++;
//        }
//        
//        i = 0;
//        System.out.println("Repetição usando do-while: ");
//        do{
//            System.out.println("numero " + i);
//            i++;
//        }while(i <= 10);
//    }
    
    //Operadores aritiméticos
    int soma, subtracao, multiplicacao;
    Integer divisao;
    Float divisao1;
    
    soma = 1 + 1;
    subtracao = 1 - 1;
    multiplicacao = 1 * 2;
    divisao1 = (float) (4 / 5);
    divisao = divisao1.intValue();
    System.out.println("Soma = " + soma);
    System.out.println("Subtra��o = " + subtracao);
    System.out.println("Multiplica��o = " + multiplicacao);
    System.out.println("Divis�o = " + divisao1);
    }
}
