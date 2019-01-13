/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3bim;

/**
 *
 * @author rafael
 */
public class Circunferencia2D {
    private int[] centroXY = new int[2];
    private int raio;

    Circunferencia2D(int x, int y, int raio){
        this.centroXY[0] = x;
        this.centroXY[1] = y;
        this.raio = raio;
    }
    Circunferencia2D(int raio){
        this.raio = raio;
        this.centroXY[0] = 0;
        this.centroXY[1] = 1;
    }
    public int getRaio(){
        return raio;
    }

    public int[] getCentro(){
        return this.centroXY;
    }

    public void setRaio(int novo_raio){
        this.raio = novo_raio;
    }

    public double retornaArea(){
        return 3.14 * (raio * raio);
    }

    public double retornaComprimento(){
        return 2 * 3.14 * raio;    
    }

    public void deslocaCentro(int x, int y){
        centroXY[0] = x;
        centroXY[1] = y;
    }
}
