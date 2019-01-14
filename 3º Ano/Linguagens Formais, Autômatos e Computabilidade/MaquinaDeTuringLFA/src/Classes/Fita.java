package Classes;

//@author Rafael


public class Fita {
    private final String fita[] = new String[2048]; //Armazena a fita
    private final String[] palavra; //Armazena a palavra
    private int cabecote = 1; //Armazena a posição do cabeçote (iniciando na primeira posição da fita (1))
    private final String branco;
    private boolean palavraProcessada; //Diz se a palavra já foi inteiramente processada
    
    public Fita(String[] p, String m, String b){
        this.palavra = p;
        this.branco = b;
        for (int i = 0; i < fita.length; i++) { //Povoa o vetor fita com simbolos branco
            this.fita[i] = b;
        }
        this.fita[0] = m; //Adiciona o marcador de inicio ao inicio do vetor
        if (p[0].equals("")) { //Caso seja palavra vazia
            this.fita[1] = b;
        }else{
            for (int i = 0; i < p.length; i++) { //Insere a palavra no vetor
                this.fita[i+1] = p[i];
            }
        }
    }

    public String[] getFita() {
        return fita;
    }

    public void setFita(String escreve, int pos) {
        this.fita[pos] = escreve;
    }

    public String[] getPalavra() {
        return palavra;
    }

    public int getCabecote() {
        return cabecote;
    }

    public void setCabecote(int cabecote) {
        this.cabecote = cabecote;
    }

    public void setPalavraProcessada(boolean palavraProcessada) {
        this.palavraProcessada = palavraProcessada;
    }

    public boolean isPalavraProcessada() {
        return palavraProcessada;
    }
}
