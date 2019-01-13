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
public class Conjunto {
    private ArrayList<String> listastring = new ArrayList();
    
    Conjunto(){
    }
    
    public ArrayList<String> getVetor(){
        return listastring;
    }
    
    public void apagaVetor(){
        listastring.removeAll(listastring);
    }
    
    public void addElemento(String e){
        if (listastring.indexOf(e) == -1){
            listastring.add(e);
        }         
    }
       
    public int verificaElemento(String e){
        if(listastring.indexOf(e) == -1)
            return 0; //Se não tiver
        else
            return 1; //Se tiver
    }
    
    public void uniaoConjuntos(Conjunto conjunto1){
        int aux = conjunto1.getVetor().size();
        
        for(int i = 0; i < aux; i++){
            if(verificaElemento(conjunto1.getVetor().get(i)) == 0)
                addElemento(conjunto1.getVetor().get(i));
        }
    }
    
    public void interConjuntos(Conjunto conjunto1){
        int aux = conjunto1.getVetor().size();
        ArrayList<String> string2 = new ArrayList();
        for(int i = 0; i < aux; i++){
            if(verificaElemento(conjunto1.getVetor().get(i)) == 1)
                string2.add(conjunto1.getVetor().get(i));               
        }
        apagaVetor();
        for(int j = 0; j < string2.size(); j++){
            addElemento(string2.get(j));
        }
        
    }
    
    public void subtrConjuntos(Conjunto conjunto1){
        int aux = conjunto1.getVetor().size();
        ArrayList<String> string2 = new ArrayList();
        for(int i = 0; i < aux; i++){
            if(verificaElemento(conjunto1.getVetor().get(i)) == 0)
              string2.add(conjunto1.getVetor().get(i));
        }
        apagaVetor();
        for(int j = 0; j < string2.size(); j++){
            addElemento(string2.get(j));
        }
    }
    
}
