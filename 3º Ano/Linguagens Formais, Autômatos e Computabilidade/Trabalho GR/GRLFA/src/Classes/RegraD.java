package Classes;

/**
 *
 * @author Rafael
 */
public class RegraD {
    private final String esquerda;
    private final Variavel direita;
    private final int numero;
    
    public RegraD(String esq, Variavel dir, int num){
        this.esquerda = esq;
        this.direita = dir;
        this.numero = num;
    }

    public String getEsquerda() {
        return esquerda;
    }

    public Variavel getDireita() {
        return direita;
    }

    public int getNumero() {
        return numero;
    }
    
    
}
