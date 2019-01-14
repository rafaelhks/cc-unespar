package Classes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Arvore {
    private List<Integer> passos = new ArrayList<>();
    private final Variavel raiz;
    private final String tipo, vz="&";
    private String palavra[];
    private int c = 0;
    private boolean fim = false;
    
    public Arvore(Variavel r, String p, String t){
        this.raiz = r;
        this.tipo = t;
        if(t.equals("GLUD")){ //Se for GLUD
            this.palavra = p.replace(" ", "").split("");
        }else if(t.equals("GLUE")){ //Se for GLUE
            StringBuilder sb = new StringBuilder(p);
            this.palavra = sb.reverse().toString().replace(" ", "").split("");
        }
        desce(this.raiz, palavra[c]);
    }
    
    public void desce(Variavel v, String letra){
        if(c>=100) Result('L');
        System.out.println(v.getNome());
        if(tipo.equals("GLUD") && fim==false){
            System.out.println(v.getRegrasD().size());
            for(RegraD r: v.getRegrasD()){
                desceDireita(v, r, palavra[c]);
            }
        }
        if(tipo.equals("GLUE")&& fim==false){
            System.out.println(v.getRegrasE().size());
            for(RegraE r: v.getRegrasE()){
                desceEsquerda(v, r, palavra[c]);
            } 
        }
    }
    
    private void desceDireita(Variavel v, RegraD r, String letra){
        if(r.getEsquerda().equals("VAZIO") && fim == false){ //Se for apenas a direita (variável)
            System.out.println("entrou vazia");
            passos.add(r.getNumero()); //Adiciona aos passos
            desce(r.getDireita(), palavra[c]); //Desce sem incrementar o contador da posição
        }     
        //Checa se o esquerdo é igual à letra analisada
        if((r.getEsquerda().equals(letra) || r.getEsquerda().equals(vz)) && fim == false){ 
            System.out.println("Esquerdo = "+letra);   

            //Se houver uma variável à direita e a palavra não foi processada, continua descendo a arvore
            if(r.getDireita()!=null && !lookahead(c).equals("END") && !r.getEsquerda().equals(vz)){
                passos.add(r.getNumero());
                System.out.println(r.getEsquerda());
                System.out.println("desceu");
                GUI.Tela.resultado.setText("Descendo àrvore...\nSe esta mensagem\npersistir a gramática\npode estar em\nLOOP ou \nestado de erro!");
                desce(r.getDireita(), palavra[++c]); //desce
            }
            //Se não tiver variável na direita e a palavra foi processada, termina aceitando
            if(r.getDireita()==null && lookahead(c).equals("END") && fim==false){
                passos.add(r.getNumero()); //Adiciona aos passos
                Result('P');
                System.out.println("Processou a palavra com terminal");
            }
            //Se não tiver variável na direita e a palavra NÃO foi processada
            if(r.getDireita()==null && !lookahead(c).equals("END") && !r.getEsquerda().equals(vz) && fim==false){
                  for(RegraD rg: v.getRegrasD()){
                      if(rg.getEsquerda().equals(vz)){ //Se tiver vazio na variavel, pode terminar
                          passos.add(rg.getNumero());
                          Result('N');
                      }
                      //Se tiver como continuar com a letra do lookahead, continua
                      if(rg!=r && rg.getEsquerda().equals(lookahead(c)) && rg.getDireita()!=null){ 
                          System.out.println("Desceu");
                          GUI.Tela.resultado.setText("Descendo àrvore...\nSe esta mensagem\npersistir a gramática\npode estar em\nLOOP ou \nestado de erro!");
                          passos.add(rg.getNumero());
                          desce(rg.getDireita(), palavra[++c]);
                      }
                  }
            }
            //Se houver variável na direita, a palavra chegou ao fim e a regra possui o vazio 
            if(r.getDireita()!=null && lookahead(c).equals("END") && !r.getEsquerda().equals(vz) && fim == false){
                boolean exist = false, existL = false, existLR = false; //Diz se existe ou não
                int numRG = 0; //Numero da variavel adquirida no for abaixo
                for(RegraD rgr: r.getDireita().getRegrasD()){ //Procura uma regra na variável direita que possua vazio ou a letra atual
                    if(rgr.getEsquerda().equals(vz)){ //Se tiver vazio
                        exist = true;
                        numRG = rgr.getNumero();
                    }
                    if(rgr.getEsquerda().equals(letra) && rgr!=r){ //Se a esquerda for a letra
                        existL = true;
                        numRG = rgr.getNumero();
                    }
                    if(rgr.getEsquerda().equals(vz) && rgr==r){
                        existLR = true;
                    }
                }
                if(existLR==true && fim==false){
                    passos.add(r.getNumero());
                    Result('P');
                    System.out.println("Processou a palavra**");
                }
                if(existL==true && fim==false){
                    passos.add(r.getNumero());
                    passos.add(numRG);
                    Result('P');
                    System.out.println("Processou a palavra*");
                }
                if(exist==true && fim==false){
                    passos.add(r.getNumero());
                    passos.add(numRG);
                    Result('P');
                    System.out.println("Processou a palavra com vazio*");
                }if(exist==false && fim == false){
                    Result('N');
                    System.out.println("Não processou a palavra*");
                }
            }
        }
        //Se esquerda não for a letra e palavra não terminou
        if(!r.getEsquerda().equals(letra) && fim==false){
            System.out.println("Esquerda!=letra");
            boolean exists = false; //Diz se existe
            int numRGEsq = -1; //Armazenara o numero da variavel encontrada no for abaixo
            Variavel vr = null; //Armazenada a variavel que será a proxima, caso exista
            for(RegraD rg: v.getRegrasD()){ //Procura uma Regra que contenha a letra atual dentro da Variavel atual
                if(rg.getEsquerda().equals(letra)){
                    exists = true;
                    numRGEsq = rg.getNumero();
                    vr = rg.getDireita();
                }
            }
            if(exists == true  && !lookahead(c).equals("END") && fim==false){
                passos.add(numRGEsq);
                GUI.Tela.resultado.setText("Descendo àrvore...\nSe esta mensagem\npersistir a gramática\npode estar em\nLOOP ou \nestado de erro!");
                desce(vr, palavra[++c]);
            }
            if(exists == true  && lookahead(c).equals("END") && fim==false){
                passos.add(numRGEsq);
                Result('P');
            }
            if(exists == false  && fim==false){
                passos.add(r.getNumero());
                Result('N');
                System.out.println("Nao processou letra inexistente");
            }
        }
    }
    
    private void desceEsquerda(Variavel v, RegraE r, String letra){
        if(r.getDireita().equals("VAZIO") && fim == false){ //Se for apenas a direita (variável)
            System.out.println("entrou vazia");
            passos.add(r.getNumero()); //Adiciona aos passos
            desce(r.getEsquerda(), palavra[c]); //Desce sem incrementar o contador da posição
        }     
        //Checa se o direito é igual à letra analisada
        if((r.getDireita().equals(letra) || r.getDireita().equals(vz)) && fim == false){ 
            System.out.println("Esquerdo = "+letra);   

            //Se houver uma variável à esquerda e a palavra não foi processada, continua descendo a arvore
            if(r.getEsquerda()!=null && !lookahead(c).equals("END") && !r.getDireita().equals(vz)){
                passos.add(r.getNumero());
                System.out.println(r.getDireita());
                System.out.println("desceu");
                GUI.Tela.resultado.setText("Descendo àrvore...\nSe esta mensagem\npersistir a gramática\npode estar em\nLOOP ou \nestado de erro!");
                desce(r.getEsquerda(), palavra[++c]);
            }
            //Se não tiver variável na esquerda e a palavra foi processada, termina aceitando
            if(r.getEsquerda()==null && lookahead(c).equals("END") && fim==false){
                passos.add(r.getNumero()); //Adiciona aos passos
                Result('P');
                System.out.println("Processou a palavra com terminal");
            }
            //Se não tiver variável na esquerda e a palavra NÃO foi processada
            if(r.getEsquerda()==null && !lookahead(c).equals("END") && !r.getDireita().equals(vz) && fim==false){
                  for(RegraE rg: v.getRegrasE()){
                      if(rg.getDireita().equals(vz)){ //Se tiver vazio na variavel, pode terminar
                          passos.add(rg.getNumero());
                          Result('N');
                      }
                      //Se tiver como continuar com a letra do lookahead, continua
                      if(rg!=r && rg.getDireita().equals(lookahead(c)) && rg.getEsquerda()!=null){ 
                          System.out.println("Desceu");
                          GUI.Tela.resultado.setText("Descendo àrvore...\nSe esta mensagem\npersistir a gramática\npode estar em\nLOOP ou \nestado de erro!");
                          passos.add(rg.getNumero());
                          desce(rg.getEsquerda(), palavra[++c]);
                      }
                  }
            }
            //Se houver variável na esquerda, a palavra chegou ao fim e a regra possui o vazio 
            if(r.getEsquerda()!=null && lookahead(c).equals("END") && !r.getDireita().equals(vz) && fim == false){
                boolean exist = false, existL = false, existLR = false;
                int numRG = 0;
                for(RegraE rgr: r.getEsquerda().getRegrasE()){
                    if(rgr.getDireita().equals(vz)){ //Se tiver vazio
                        exist = true;
                        numRG = rgr.getNumero();
                    }
                    if(rgr.getDireita().equals(letra) && rgr!=r){ //Se a esquerda for a letra
                        existL = true;
                        numRG = rgr.getNumero();
                    }
                    if(rgr.getDireita().equals(vz) && rgr==r){
                        existLR = true;
                    }
                }
                if(existLR==true && fim==false){
                    passos.add(r.getNumero());
                    Result('P');
                    System.out.println("Processou a palavra**");
                }
                if(existL==true && fim==false){
                    passos.add(r.getNumero());
                    passos.add(numRG);
                    Result('P');
                    System.out.println("Processou a palavra*");
                }
                if(exist==true && fim==false){
                    passos.add(r.getNumero());
                    passos.add(numRG);
                    Result('P');
                    System.out.println("Processou a palavra com vazio*");
                }if(exist==false && fim == false){
                    Result('N');
                    System.out.println("Não processou a palavra*");
                }
            }
        }
        //Se direita não for a letra e palavra não terminou
        if(!r.getDireita().equals(letra) && fim==false){
            System.out.println("Esquerda!=letra");
            boolean exists = false; //Diz se existe
            int numRGEsq = -1; //Armazenara o numero da variavel encontrada no for abaixo
            Variavel vr = null; //Armazenada a variavel que será a proxima, caso exista
            for(RegraE rg: v.getRegrasE()){ //Procura uma Regra que contenha a letra atual dentro da Variavel atual
                if(rg.getDireita().equals(letra)){
                    exists = true;
                    numRGEsq = rg.getNumero();
                    vr = rg.getEsquerda();
                }
            }
            if(exists == true  && !lookahead(c).equals("END") && fim==false){
                passos.add(numRGEsq);
                GUI.Tela.resultado.setText("Descendo àrvore...\nSe esta mensagem\npersistir a gramática\npode estar em\nLOOP ou \nestado de erro!");
                desce(vr, palavra[++c]);
            }
            if(exists == true  && lookahead(c).equals("END") && fim==false){
                passos.add(numRGEsq);
                Result('P');
            }
            if(exists == false  && fim==false){
                passos.add(r.getNumero());
                Result('N');
                System.out.println("Nao processou letra inexistente");
            }
        }
    }
    
    private void Result(char op){ //Mostra os passos na tela, ou mensagem de erro, ao terminar
        GUI.Tela.resultado.setText("");
        fim = true;
        switch (op) {
            case 'P':
                for(Integer it: passos){
                    GUI.Tela.resultado.setText(GUI.Tela.resultado.getText()+it+"\n");
                }   
                GUI.Tela.resultado.setText(GUI.Tela.resultado.getText()+"Processou a palavra");
                break;
            case 'N':
                for(Integer it: passos){
                    GUI.Tela.resultado.setText(GUI.Tela.resultado.getText()+it+"\n");
                }   
                GUI.Tela.resultado.setText("Não processou.\nPalavra não pertence \nà gramática descrita!");
                break;
            case 'L':
                GUI.Tela.resultado.setText("Não processou.\nEntrou em LOOP!");
                break;
            default:
                break;
        }
    }
    
    private String lookahead(int i){ //retorna o próximo caractere ou a flag END para final de palavra
        if(i+1>=palavra.length || palavra.length==1)
            return "END";
        return palavra[i+1];
    }
}
