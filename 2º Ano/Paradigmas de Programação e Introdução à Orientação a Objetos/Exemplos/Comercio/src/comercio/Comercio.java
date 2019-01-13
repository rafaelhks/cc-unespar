package comercio;


public class Comercio {
    
    public static void Hello() {
        System.out.println("Hello world!");
    }
    
    public static void main(String[] args) {
        
        Compra c = new Compra(500);
        
        System.out.println("\n * COMPRA À VISTA");
        c.imprimir();
        
        Compra c_parcelada = new Compra(4, 250);
        
        System.out.println("\n * COMPRA PARCELADA");
        c_parcelada.imprimir();
        
    }
    
}
