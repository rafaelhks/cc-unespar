package arvore.buscas.estruturas;

import java.util.List;

public class MeuNoh extends Noh {

	public MeuNoh(int valor, List<Noh> filhos, int custo) {
		super(valor, filhos, custo);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Noh arg0) {
		int resultado = super.compareTo(arg0);
		if(resultado==0){
			return 0;
		}
		return resultado;
	}

}
