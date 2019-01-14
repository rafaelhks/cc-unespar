package Classes;

//@author Rafael

public class Transicao {
    private String eAtual; //Armazena o estado Atual
    private String leitura; //Armazena o que será lido da fita
    private String eDestino; //Armazena o estado de Destino
    private String escreve; //Armazena o que será escrito na fita
    private String sentido; //Armazena o sentido (D ou E);
    
    public Transicao(String[] eA, String[] eD){ //Inicializa as variáveis
        eAtual = eA[0];
        leitura = eA[1];
        eDestino = eD[0];
        escreve = eD[1];
        sentido = eD[2];
    }

    public String getAtual() {
        return eAtual;
    }

    public String getDestino() {
        return eDestino;
    }

    public String getLetra() {
        return leitura;
    }

    public void setLetra(String letra) {
        this.leitura = letra;
    }

    public String getEscreve() {
        return escreve;
    }

    public void setEscreve(String escreve) {
        this.escreve = escreve;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }
    
}
