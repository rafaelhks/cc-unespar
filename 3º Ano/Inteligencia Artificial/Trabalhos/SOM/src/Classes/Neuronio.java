package Classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class Neuronio {
    private int indice;
    private int tamAmostras;
    private double[] w; //pesos w
    private List<Integer> vizinhos = new ArrayList();
    
    public Neuronio(int indice, int tAmostras){
        this.indice = indice;
        this.tamAmostras = tAmostras;
        this.w = new double[tAmostras];
        
        Random rnd = new Random();
        for(int i=0; i<tAmostras; i++){            
            w[i] = rnd.nextDouble();
        }
    } 
    
    public double distancia(double x[]){
        double dist = 0, soma = 0;
        for(int i=0; i<x.length; i++){
            soma += Math.pow((x[i]-w[i]), 2);
        }
        
        dist = Math.sqrt(soma);
        
        return dist;
    }
    
    public void atualizaPesos(double x[]){
        for(int i=0; i<w.length; i++){
            w[i] = w[i]+0.01+(x[i]-w[i]);
        }
    }

    public int getIndice() {
        return indice;
    }

    public double[] getCaracteristicas() {
        return w;
    }
    
    public void addVizinho(int n){
        vizinhos.add(n);
    }
    
    public List<Integer> getVizinhos(){
        return vizinhos;
    }
}
