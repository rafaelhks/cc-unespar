package Classes;

/**
 *
 * @author Rafael
 */
public class RegraE {
    private final Variavel esquerda;
    private final String direita;
    private final int numero;
    
    public RegraE(Variavel esq, String dir, int num){
        this.esquerda = esq;
        this.direita = dir;
        this.numero = num;
    }

    public Variavel getEsquerda() {
        return esquerda;
    }

    public String getDireita() {
        return direita;
    }

    public int getNumero() {
        return numero;
    }
}
