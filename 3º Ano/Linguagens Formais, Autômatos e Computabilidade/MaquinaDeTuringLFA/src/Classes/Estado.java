package Classes;
import java.util.ArrayList;
import java.util.List;

//@author Rafael

public class Estado {
    private List<Transicao> trans = new ArrayList<>();
    private String nome;
    
    public Estado(String n){
        this.nome = n;
    }

    public List<Transicao> getTrans() {
        return trans;
    }
    
    public void addTrans(Transicao t) {
        trans.add(t);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
