
package exemplos_27_09;

import java.util.ArrayList;
import java.util.Iterator;


public class Array {
    public static void main(String args[]) {				 
        // Defina a capacidade inicial
        ArrayList array_teste = new ArrayList();
        array_teste.add(3);
        array_teste.add(2);              
        array_teste.add(1);
        array_teste.add(4);
        array_teste.add(5);
        array_teste.add(6);
        array_teste.add(6);
        
        Iterator iter1 = array_teste.iterator();
        while(iter1.hasNext()){
                System.out.println(iter1.next());
        }

        for (int i=0; i<array_teste.size(); i++) {
            System.out.println(" Elemento " + i + ": " + array_teste.get(i)) ;
        }

        System.out.println(array_teste.get(2));

    }
    
}
