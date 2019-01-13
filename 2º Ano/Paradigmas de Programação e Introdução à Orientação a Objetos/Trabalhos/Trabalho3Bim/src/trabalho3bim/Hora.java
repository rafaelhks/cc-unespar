/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bim;

/**
 *
 * @author rafael
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    Hora(){
        
    }
    
    Hora(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setHora(int hora){
        this.hora = hora;
    }
    
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    
    public int retornaSegundos(){
        return segundo + (minuto * 60) + (hora * 3600);
    }
    
    public void diferencaHorario(int hora, int minuto, int segundo){    
        System.out.println("Hora: "+(this.hora-hora)+"\nMinuto: "+(this.minuto-minuto)+"\nSegundo: "+(this.segundo-segundo));
    }
    @Override
    public String toString(){
        return hora+":"+minuto+":"+segundo;
    }
    
}
