/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author SALAPROF.06
 */
public class Principal{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lerDado = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa("João");
        pessoa1.setIdade(10);
        pessoa1.setCpf("246164516264");
        
        Pessoa pessoa2 = new Pessoa("João Dois");
        pessoa1.setIdade(25);
        pessoa1.setCpf("454327853278");
        
        String auxiliar;
        System.out.println("Entre com o nome: ");
        auxiliar = lerDado.next();
        Pessoa pessoa3 = new Pessoa(auxiliar);
        System.out.println("Entre com o cpf: ");
        auxiliar = lerDado.next();
        pessoa3.setCpf(auxiliar);
        System.out.println("Entre com a idade: ");
        auxiliar = lerDado.next();
        //ou
        int idade = lerDado.nextInt();
        //pessoa3.setIdade(Integer.parseInt(auxiliar);
        pessoa3.setIdade(idade);
        
        System.out.println("nome: " + pessoa3.getNome());
        System.out.println("Idade: " + pessoa3.getIdade());
        System.out.println("Cpf: " + pessoa3.getCpf());
                
}
}