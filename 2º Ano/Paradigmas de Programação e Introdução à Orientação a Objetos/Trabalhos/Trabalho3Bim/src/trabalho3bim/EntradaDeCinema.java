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
public class EntradaDeCinema {
    private int sala;
    private double valor;
    public Data data = new Data();
    private Hora hora = new Hora();
    
    EntradaDeCinema(){
    
    }
    
    EntradaDeCinema(int sala, double valor, int dia, int mes, int ano, int hora, int minuto, int segundo){
        this.sala = sala;
        this.valor = valor;
        this.data.setAno(ano);
        this.data.setMes(mes);
        this.data.setDia(dia);
        this.hora.setHora(hora);
        this.hora.setMinuto(minuto);
        this.hora.setSegundo(segundo);           
    }   
     
    public void setAno(int ano){
       data.setAno(ano);
    }  
      
    public void setMes(int mes){
        data.setMes(mes);
    } 
    
    public void setDia(int dia){
        data.setDia(dia);
    } 

    public void setSala(int sala){
        this.sala = sala;
    }   
    
    public void setValor(double valor){
        this.valor = valor;
    }  
         
    public void setHora(int _hora){
        hora.setHora(_hora);
    }  
    
    public void setMinuto(int minuto){
        hora.setMinuto(minuto);
    }  
    
    public void setSegundo(int segundo){
        hora.setSegundo(segundo);
    }  
    
    public void calculaDesconto(Data nascimento){
       if(data.getAno() - nascimento.getAno() < 12)
           valor = valor * 0.6;
    }
    
    public void calculaDesconto(Data nascimento, int idaluno){
        if(data.getAno() - nascimento.getAno() >= 12 && data.getAno() - nascimento.getAno() <= 15)
            valor = valor * 0.6;
        if(data.getAno() - nascimento.getAno() >= 16 && data.getAno() - nascimento.getAno() <= 20)
            valor = valor * 0.7;
        if(data.getAno() - nascimento.getAno() > 20){        
            valor = valor * 0.8;
        }
    }
    
    public void calculaDescontoHorario(){
        int aux1 = (hora.getSegundo() + (hora.getMinuto() * 60) + (hora.getHora() * 3600));
        int aux2 = 16 * 3600;
        if(aux1 < aux2)
            valor = valor * 0.9;
    }
    @Override
    public String toString(){     
        return ("Sala: "+sala+"\n"+"Valor: "+valor+"\n"+"Data: "+data.toString()+"\n"+"Hora: "+hora.toString());
    }

}
