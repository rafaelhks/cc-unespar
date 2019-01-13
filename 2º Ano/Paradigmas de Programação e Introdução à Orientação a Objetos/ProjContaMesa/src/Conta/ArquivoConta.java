package Conta;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author rafael
 */
public class ArquivoConta {
    private static String conta;
    private String mesa;
    private String data;
    private String hora;
    private static String nomearquivo;
    
    public ArquivoConta(){
        //Inicia alguns dos atributos da classe
        this.mesa = Principal.TelaPrincipal.Mesa.getText();
        this.data = DataEHora.Data.FormataDataExtenso();
        this.hora = DataEHora.Hora.FormataHora();
        nomearquivo = this.mesa+" ("+this.data+" "+this.hora+")";
    }
    
    public static void CriaArquivo(){
        FormataConta.setContafinal(); //Formata a conta para a ficha final
        conta = FormataConta.getContafinal(); //Pega a conta formatada
        try{
            File arq = new File("BDContas/"+nomearquivo+".txt"); //Cria arquivo, se já existir, será sobreescrito
            FileWriter fw = new FileWriter(arq); 
            BufferedWriter bw = new BufferedWriter(fw);  
            bw.write(conta); //Reescreve a conta atualizada no arquivo
            bw.flush();  
            bw.close(); //Fecha para salvar
        } catch (IOException ex) {}   
    }
}
