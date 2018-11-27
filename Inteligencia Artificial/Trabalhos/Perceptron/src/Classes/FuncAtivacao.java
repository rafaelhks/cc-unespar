package Classes;

public class FuncAtivacao {
	private double entrada;
	private double saida;
	
	public FuncAtivacao(double u) {
		this.entrada = u;
	}
	
	public double sgn() {
		if(this.entrada < 0)
			this.saida = -1;
		if(this.entrada >= 0) 
			this.saida = 1;

		return this.saida;
	}
}
