/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 * Classe para representar uma data no formato hh:mm:ss.
 * @author fabio
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    /**
     * Construtor para inicializar os atributos dia, mes e ano e validar a entrada.
     * @param dia tempo em dia
     * @param mes tempo em mês
     * @param ano tempo em ano
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    
}
