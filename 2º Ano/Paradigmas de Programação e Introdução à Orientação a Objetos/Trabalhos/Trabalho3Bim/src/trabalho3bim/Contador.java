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
public class Contador {
    private int v;
    
    Contador(){
        v = 0;
    }
    Contador(int valor){
        this.v = valor;
    }
    public void Zerar(){
        v = 0;
    }
    public void Incrementar(){
        v += v;
    }
    public void Decrementar(){
        v -= v;
    }
    public int retornaContador(){
        return v;
    }
}
