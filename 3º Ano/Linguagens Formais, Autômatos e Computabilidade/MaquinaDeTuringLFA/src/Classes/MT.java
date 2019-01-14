package Classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@author Rafael

public class MT {
    private final List<Estado> listEstados = new ArrayList<>(); //Estados
    private List<Transicao> trans = new ArrayList<>(); //Todas as transições
    private static String[] estados; //Nomes dos estados
    private final String[] alfabeto;
    private final String inicial; //Estado inicial
    private final List<String> listFinais = new ArrayList<>(); //Estados finais
    private final String[] alfabetoAux;
    private final String marcador;
    private final String branco; 
    private final String[] palavra; //Palavra que está sendo testada
    private final Fita fita; //Fita da máquina
    private int contador; //Contador de movimentos/alterações

    public MT(String[] e, String[] a, String eInicial, String[] eFinais, String[] aAux, String m, String b, String[] p, List t)
    {
        estados = e;
        for (int i = 0; i < estados.length; i++) { //Alimenta a lista de estados
            listEstados.add(new Estado(e[i]));
        }
        this.inicial = eInicial;
        this.alfabeto = a;
        listFinais.addAll(Arrays.asList(eFinais)); //Alimenta a lista de estados finais
        this.alfabetoAux = aAux;
        this.marcador = m;
        this.branco = b;
        this.palavra = p;
        this.fita = new Fita(p, m, b);
        this.trans = t;
        addTrans(); //Adiciona as transições aos seus respectivos estados
        mostraFita(); //Mostra a fita inicial
        caminha(descobreInicial()); //Inicia o processamento da palavra a partir do estado inicial
    }
    
    public Estado descobreInicial(){ //Descobre qual o estado inicial na lista de estados
        Estado est = null; //Recebe o estado inicial descoberto abaixo
        for (int i = 0; i < listEstados.size(); i++) { //Descobre o estado inicial
            //Compara cada estado da lista com o incial informado pelo usuário
            if(listEstados.get(i).getNome().equals(this.inicial)) 
                est = listEstados.get(i); //O estado inicial
        }    
        return est; //retorna o estado inicial
    }    
    
    //Aplica alterações na fita e mostra cada uma delas na tela
    public void alteraFita(int pos, String escreve){
        fita.setFita(escreve, pos); //Altera na fita, na posição "pos" do cabeçote
        mostraFita(); //Mostra fita alterada na tela
        contador++; //Incrementa o contador de movimentos/alterações
    }
    
    //Executa a operação da máquina
    public void caminha(Estado atual){
        List<Transicao> t = atual.getTrans(); //Recebe as trasições do estado atual
        int pos = fita.getCabecote(); //Descobre posicao do cabeçote
        String le = fita.getFita()[pos]; //Descobre a letra no cabeçote
        boolean existe = false; //Se existe transição para um próximo estado com a letra lida da fita
        Estado proxEstado = null; //Armazenará o proximo estado, se houver
        
        for (int i = 0; i < t.size(); i++) { //Percorre lista de transições do estado
            if(t.get(i).getLetra().equals(le)){ //Checa se a letra na pos. do cabeçote é igual a da transição
                existe = true;
                alteraFita(pos, t.get(i).getEscreve()); //Altera na fita

                if(t.get(i).getSentido().equals("D")){ //Se D, cabeçote vai pra direita
                    fita.setCabecote(pos+1);
                }else if(t.get(i).getSentido().equals("E")){ //Se E, cabeçote vai pra esquerda
                    fita.setCabecote(pos-1);
                }

                for (int j = 0; j < listEstados.size(); j++) { //Descobre proximo estado e armazena em proxEstado
                    if(t.get(i).getDestino().equals(listEstados.get(j).getNome()))
                        proxEstado = listEstados.get(j);
                }
                
                //Se for estado final, aceita (e palavra processada, no caso de reconhecedora)
                if(listFinais.contains(proxEstado.getNome()) && contador>=palavra.length){ 
                    GUI.Tela.mostraOp.setText(GUI.Tela.mostraOp.getText()+"Palavra pertence à linguagem\ndescrita.\n");  
                }else{
                    caminha(proxEstado); //Recursão com próximo estado
                }
            }
        }
        
        //Se atingir um estado sem transição com a letra e que seja não final
        if(existe == false && !listFinais.contains(atual.getNome())){
            GUI.Tela.mostraOp.setText(GUI.Tela.mostraOp.getText()+"Erro no estado: "+atual.getNome()+"\nPalavra não pertence\nà linguagem descrita.\n"); 
        }
        //Se atingir um estado sem transição e que seja final e a palavra não tenha sido processada ainda
        else if (existe == false && listFinais.contains(atual.getNome()) && contador<palavra.length) {
            GUI.Tela.mostraOp.setText(GUI.Tela.mostraOp.getText()+"Erro no estado: "+atual.getNome()+"\nPalavra não pertence\nà linguagem descrita.\n"); 
        }
    }
    
    public void addTrans() { //Adiciona as transições aos seus respectivos estados
        for (int i = 0; i < trans.size(); i++) { //Percorre a lista de transições
            Transicao t = trans.get(i);
            //Percorre a lista de estados
            for (int j = 0; j < this.listEstados.size(); j++) { 
                Estado e = listEstados.get(j);
                if(e.getNome().equals(t.getAtual())){ //Encontra o estado ao qual a transição pertence
                    e.addTrans(t); //Adiciona a transição ao estado
                }
            }
        }
    }
    
    public void mostraFita(){ //Mostra a fita na tela 
        String f = "";
        for(String obj: fita.getFita()){ //Adiciona à string 'f' a fita
            f = f+obj;
        }
        //Printa a fita
        GUI.Tela.mostraOp.setText(GUI.Tela.mostraOp.getText()+f+"\n");
    }
}