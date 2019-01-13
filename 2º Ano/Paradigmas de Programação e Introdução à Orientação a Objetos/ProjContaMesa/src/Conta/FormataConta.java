package Conta;
import java.math.BigDecimal;
import java.text.NumberFormat;
/**
 *
 * @author rafael
 */
public class FormataConta {
    
    private static String data;
    private static String hora;
    public static String cpf;
    private String valor;
    private String itens;
    private static String contaformatada;
    private static String contafinal;
    
    public void FormataConta(double v, String i){
        //INicia os atributos de itens e valor (ja formatado em reais), e tambem a conta formatada para exibiçao.
        BigDecimal vt = new BigDecimal(v);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        this.valor = "\nValor Total: "+nf.format(vt);
        this.itens = i;
        contaformatada = this.itens + "\n-------------------------------------"+this.valor;
    }

    public static String getContaFormatada() {
        return contaformatada;
    }  

    public static String getContafinal() {
        return contafinal;
    }

    public static void setContafinal() {
        //Formata a conta que sera gravada no arquivo, com data, hora, cpf, itens e valor final.
        data = DataEHora.Data.FormataData();
        hora = DataEHora.Hora.FormataHora();
        if (cpf == null) { //Se o cpf nao foi informado
            contafinal = "-------------CUPOM FISCAL------------\nData: "+data+"\nHora do fechamento da conta: "+hora+"\nCPF do contribuinte: Não informado\n\n"+contaformatada;
        }else{// Se o cpf foi informado
            contafinal = "-------------CUPOM FISCAL------------\nData: "+data+"\nHora do fechamento da conta: "+hora+"\nCPF do contribuinte: "+cpf+"\n\n"+contaformatada;
        }        
    }
}