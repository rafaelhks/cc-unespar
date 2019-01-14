package Classes;

import java.util.Random;

public class Neuronio {
	private double entradas[]; //Entrada
	private int nEnt; //número de entradas
	public double w[]; //Pesos sinápticos de cada amostra
	private double resSoma = 0; //Resultado da soma
	public double theta; //Theta de cada amostra
	private double resultado; //resultado final y
	
	public Neuronio(int nE, double bias) {
		this.resultado = 0; //Inicializa resultado
		this.nEnt = nE; //Inicializa numero de entradas
		this.theta = bias;
		initPesos(); //Inicializa pesos
	}
	
	public double init(double e[]) {
		this.entradas = e; //Incializa entradas
		Somador(); //Somador
		FuncAtivacao fa = new FuncAtivacao(this.resSoma); 
		this.resultado = fa.sgn(); //Retorna 1 ou -1
		return this.resultado; //Saída do neurônio
	}
	
	private void initPesos() { //Inicializa pesos randomicamente 
		w = new double[nEnt]; //w[numero de entradas]
		double aux; 
		Random rnd = new Random();

		for(int j=0; j<nEnt; j++) {
			aux = rnd.nextDouble();
			if(aux>0)
				w[j] = aux;
		}
	}
	
	public void Somador() { //Somador das multiplicações
		for(int i=0; i<nEnt; i++) {
			resSoma+=this.w[i]*this.entradas[i];
		}
	}
}
