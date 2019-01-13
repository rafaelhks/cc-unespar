
package comercio;


public class Compra {
    private double valorTotal;
    private int numeroParcelas;
    
    // Podemos criar mais de um tipo de construtor
    // esses construtores são utilizados para representar situações diferentes
    
    // À vista, sem parcela
    public Compra(double valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }
    
    // Parcelado
    public Compra(int qtdParcela, double valorParcela) {
        numeroParcelas = qtdParcela;
        valorTotal = numeroParcelas*valorParcela;
    } 
    
    
   public double getValorTotal() {
       return valorTotal;
   }
   
   public int getNumeroParcelas() {
       return numeroParcelas;
   }
   
   public double getValorParcela() {
       return valorTotal/numeroParcelas;
   }
   
   public void imprimir() {
       System.out.println("Número de parcelas: " + this.getNumeroParcelas());
       System.out.println("Valor total: " + this.getValorTotal());
       System.out.println("Valor parcela: " + this.getValorParcela());
   }
   
   
}
