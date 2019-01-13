/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

/**
 * Classe para representar um tempo em horas.
 * @author fabio
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    /**
     * Construtor para inicializar os atributos de hora, minuto e segundo.
     * @param hora valor da hora
     * @param minuto valor do minuto
     * @param segundo valor do segundo
     */
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    /**
     * Construtor para converter o tempo em segundos para hh:mm:ss.
     * @param segundo tempo em segundos
     */
    public Hora(int segundo) {
        this.hora = segundo/3600;
        this.minuto = (segundo%3600)/60;
        this.segundo = (segundo%3600)%60;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    /**
     * Gera uma string padrão de um objeto do tipo Hora.
     * @return 
     */
    @Override
    public String toString() {
        return this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo();
    }
    
    /**
     * Converte o tempo em hh:mm:ss para segundos.
     * @return valor inteiro representando o tempo em segundos.
     */
    public int convertToSeconds() {
        return (this.getHora()*3600 + this.getMinuto()*60 + this.getSegundo());
    }
    
}
