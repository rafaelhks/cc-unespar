/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bim;
import java.util.ArrayList;
/**
 *
 * @author rafael
 */
public class Vetor {
    private int tam;
    private ArrayList<Integer> arrayVetor = new ArrayList();
    
    
    Vetor(){
        this.tam = 0;        
    }
    
    Vetor(int[] vetor, int tamanho){
        this.tam = tamanho;
        for(int i = 0; i < tamanho; i++)
            this.arrayVetor.add(vetor[i]);
    }
    
    public ArrayList<Integer> getVetor(){
        return this.arrayVetor;
    }
    
    public void insereVetor(int valor){
        arrayVetor.add(valor);
        tam++;
    }
    
    public void removeUltimo(){
        arrayVetor.remove(arrayVetor.size()-1);
        tam--;
    }
    
    public void removePrimeiro(){
        arrayVetor.remove(0);
        tam--;
    }
            
    
    public int somaVetor(){
        int aux = 0;
        for(int i = 0; i < tam; i ++){
            aux = aux + arrayVetor.get(i);
        }
        return aux;       
    }
    
    public void setVetor(int indice, int valor){
        arrayVetor.set(indice, valor);
    }
    
    public int getVetor(int indice){
        return arrayVetor.get(indice);
    }
    
    public void addValor(int valor){
        arrayVetor.add(valor);
    }
    
    public void ordenaFlutuante(){
        int aux;
        for(int i = 0; i < arrayVetor.size() -1; i++){
            for(int j = 0; j < arrayVetor.size() -i -1; j++){
                if(arrayVetor.get(j) > arrayVetor.get(j+1)){
                    aux = arrayVetor.get(j+1);
                    arrayVetor.set(j+1, arrayVetor.get(j));
                    arrayVetor.set(j,  aux);
                }
            }
        }
    }
}
