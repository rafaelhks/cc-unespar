package arvore.buscas.estruturas;

import java.util.ArrayList;

public class Lista extends ArrayList<Object> {

	
	@Override
	public boolean add(Object o){
		MeuNoh m = (MeuNoh)o;
		for(int i=0; i<this.size(); i++){
			MeuNoh atual = ((MeuNoh)(this.get(i)));
			if(atual.custo>m.custo){
				super.add(i, o);
				return true;
			}
		}
		
		return super.add(o);
		
	}
}
