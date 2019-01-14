package Classes;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rafael
 */
public class Variavel {
    private List<RegraD> regrasD = new ArrayList(); 
    private List<RegraE> regrasE = new ArrayList();
    private final String nome;

    public Variavel(String n){
        this.nome = n;
    }
    
    public void addRegraD(RegraD r){
        regrasD.add(r);
        reordenaD();
    }
    
    public void addRegraE(RegraE r){
        regrasE.add(r);
        reordenaE();
    }

    public String getNome(){
        if(this.nome == null)
            return "";
        return this.nome;
    }

    public List<RegraD> getRegrasD(){
        return this.regrasD;
    }
    
    public List<RegraE> getRegrasE(){
        return this.regrasE;
    }
    
    public boolean ambigua(String s){
        int c = 0;
        for(RegraD r: regrasD)
            if(r.getEsquerda().equals(s))
                c++;
        if(c>1)
            return true;
        return false;
    }
    //Reordena a lista de regras com a seguinte prioridade: w,wB,B,&
    public void reordenaD(){
        List<RegraD> esq = new ArrayList();
        List<RegraD> dir = new ArrayList();
        List<RegraD> esqEdir = new ArrayList();
        List<RegraD> vazio = new ArrayList();
        for(RegraD r: regrasD){
            if(r.getDireita()==null && !r.getEsquerda().equals("&"))
                esq.add(r);
            if(r.getDireita()!=null && !r.getEsquerda().equals("VAZIO"))
                esqEdir.add(r);
            if(r.getEsquerda().equals("VAZIO"))
                dir.add(r);
            if(r.getEsquerda().equals("&"))
                vazio.add(r);
        }
        regrasD.removeAll(regrasD); //remove tudo após classificar
        for(RegraD r: esq)
            regrasD.add(r);
        for(RegraD r: esqEdir)
            regrasD.add(r);
        for(RegraD r: dir)
            regrasD.add(r);
        for(RegraD r: vazio)
            regrasD.add(r);
    }
    //Reordena a lista de regras com a seguinte prioridade: w,Bw,B,&
    public void reordenaE(){
        List<RegraE> dir = new ArrayList();
        List<RegraE> esq = new ArrayList();
        List<RegraE> esqEdir = new ArrayList();
        List<RegraE> vazio = new ArrayList();
        for(RegraE r: regrasE){
            if(r.getEsquerda()==null)
                esq.add(r);
            if(r.getEsquerda()!=null && !r.getDireita().equals("VAZIO"))
                esqEdir.add(r);
            if(r.getDireita().equals("VAZIO"))
                dir.add(r);
            if(r.getDireita().equals("&"))
                vazio.add(r);
        }
        regrasD.removeAll(regrasD); //remove tudo após classificar
        for(RegraE r: esq)
            regrasE.add(r);
        for(RegraE r: esqEdir)
            regrasE.add(r);
        for(RegraE r: dir)
            regrasE.add(r);
        for(RegraE r: vazio)
            regrasE.add(r);
    }
}
