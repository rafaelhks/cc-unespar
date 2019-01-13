package Conta;
/**
 *
 * @author rafael
 */
public class CriaConta {

    private static double totalConta;
    private static String txtconta;
    static FormataConta f = new FormataConta();

    public void iniciaConta(){ //Inicia a String txtconta para não aparecer o texto "null" na tela Principal
        txtconta  = "Mesa: "+Principal.TelaInicial.Num.getText()+"\nItens:\n-------------------------------------";
        f.FormataConta(totalConta, txtconta);
    }
    
    public static double getTotalConta() {
        return totalConta;
    }
    
    public static void setTotalConta(double t) {
        totalConta += t;
    }  

    public static String getTxtconta() {
        return txtconta;
    }

    public static void setTxtconta(String txt) {
        txtconta += "\n"+txt;
    }
    
    public static void Formata(){//chama o método que formata a conta para exibição
        f.FormataConta(totalConta, txtconta);
    }   
}
