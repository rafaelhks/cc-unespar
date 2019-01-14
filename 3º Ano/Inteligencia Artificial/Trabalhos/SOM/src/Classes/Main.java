package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Rafael
 */
public class Main {
    private static final int matrizLinhas = 4, matrizColunas = 4;
    private static final Neuronio neuronios[][] = new Neuronio[matrizLinhas][matrizColunas];
    private static final double[][] amostras = {  {0.2471, 0.1778, 0.2905},
                                            {0.8240, 0.2223, 0.7041},
                                            {0.4960, 0.7231, 0.5866},
                                            {0.2923, 0.2041, 0.2234},
                                            {0.8118, 0.2668, 0.7484},
                                            {0.4837, 0.8200, 0.4792},
                                            {0.3248, 0.2629, 0.2375},
                                            {0.7209, 0.2116, 0.7821},
                                            {0.5259, 0.6522, 0.5957},
                                            {0.2075, 0.1669, 0.1745},
                                            {0.7830, 0.3171, 0.7888},
                                            {0.5393, 0.7510, 0.5682},    };
    private static final int tamAmostra = amostras[0].length;
    private static final Neuronio vencedores[] = new Neuronio[amostras.length];
    private static List<ArrayList> classes = new ArrayList();
    private static double matrizU[][] = new double[(matrizLinhas*2)-1][(matrizColunas*2)-1];
    public static void initNeuronios(){
        int num = 1;
        System.out.println("Matriz: ");
        //Inicializa os neurônios com números de 1 até o tamanho da matriz
        for(int i=0; i<matrizLinhas; i++){
            for(int j=0; j<matrizColunas; j++){
                neuronios[i][j] = new Neuronio(num, tamAmostra);
                System.out.print(num + " \t");
                num++;
            }
            System.out.println("");
        }
    }
    
    public static double[] normaliza(int pos){
        double x[] = amostras[pos];
        double modulo, soma = 0;
        
        for(int i=0; i<tamAmostra; i++){
            soma += Math.pow(x[i], 2); 
        }
        
        modulo = Math.sqrt(soma);
        
        for(int i=0; i<tamAmostra; i++){
            x[i] = x[i]/modulo;
        }
        
        return x;
    }
    
    public static void treinamento(){
        double dist;

        //Percorre a matriz de amostras;
        for(int i=0; i<amostras.length; i++){
            double[] entrada = normaliza(i);
            double menorDist = neuronios[0][0].distancia(amostras[0]);
            Neuronio vencedor = neuronios[0][0];
            
            //Percorre a matriz de neuronios
            for(int j=0; j<matrizLinhas; j++){
                for(int k=0; k<matrizColunas; k++){
                    //Retorna a distância
                    dist = neuronios[j][k].distancia(entrada);
                    //Se distancia for menor que a menor distancia econtrada anteriormente
                    if(dist<menorDist){
                        menorDist = dist;
                        //Vencedor recebe o indice do neuronio vencedor até então
                        vencedor = neuronios[j][k];
                    }
                }
            }
            //Atualiza seus pesos
            vencedor.atualizaPesos(entrada);
        }
    }
    
    public static void distancias(){
        for(int i=0; i<matrizLinhas; i++){
            for(int j=0; j<matrizColunas; j++){
                Neuronio n = neuronios[i][j];
                List<Double> dists =  new ArrayList();
                double dod = 0, soma = 0;
                if(((i*2)-1) >= 0 && ((j*2)-1) >= 0){
                    //Se i<Linhas-1 e j<Colunas-1
                    if(i<matrizLinhas-1 && j<matrizColunas-1){
                        matrizU[(i*2)-1][((j+1)*2)-1] = n.distancia(neuronios[i-1][(j+1)-1].getCaracteristicas());
                        matrizU[((i+1)*2)-1][(j*2)-1] = n.distancia(neuronios[(i+1)-1][j-1].getCaracteristicas());
                        dists.add(matrizU[(i*2)-1][((j+1)*2)-1]);
                        dists.add(matrizU[((i+1)*2)-1][(j*2)-1]);
                    }
                    //Se i=Linhas-1 e j<Colunas-1
                    else if(i==matrizLinhas-1 && j<matrizColunas-1){
                        matrizU[(i*2)-1][((j+1)*2)-1] = n.distancia(neuronios[i-1][(j+1)-1].getCaracteristicas());
                        dists.add(matrizU[(i*2)-1][((j+1)*2)-1]);
                    }
                    //Se j=Colunas-1 e i<Linhas-1
                    else if(j==matrizColunas-1 && i<matrizLinhas-1){
                        matrizU[((i+1)*2)-1][(j*2)-1] = n.distancia(neuronios[(i+1)-1][j-1].getCaracteristicas());
                        dists.add(matrizU[((i+1)*2)-1][(j*2)-1]);
                    }
                }else{
                    //Se i<Linhas-1 e j<Colunas-1
                    if(i<matrizLinhas-1 && j<matrizColunas-1){
                        matrizU[(i*2)][((j+1)*2)] = n.distancia(neuronios[i][(j+1)].getCaracteristicas());
                        matrizU[((i+1)*2)][(j*2)] = n.distancia(neuronios[(i+1)][j].getCaracteristicas());
                        dists.add(matrizU[(i*2)][((j+1)*2)]);
                        dists.add(matrizU[((i+1)*2)][(j*2)]);
                    }
                    //Se i=Linhas-1 e j<Colunas-1
                    else if(i==matrizLinhas-1 && j<matrizColunas-1){
                        matrizU[(i*2)][((j+1)*2)] = n.distancia(neuronios[i-1][(j+1)].getCaracteristicas());
                        dists.add(matrizU[(i*2)][((j+1)*2)]);
                    }
                    //Se j=Colunas-1 e i<Linhas-1
                    else if(j==matrizColunas-1 && i<matrizLinhas-1){
                        matrizU[((i+1)*2)][(j*2)] = n.distancia(neuronios[(i+1)][j].getCaracteristicas());
                        dists.add(matrizU[((i+1)*2)][(j*2)]);
                    }
                }
                
                for(double d: dists){
                    soma+=d;
                }
                dod=soma/dists.size();
                matrizU[i][j] = dod;
            }
        }
        
        for(double d[]: matrizU){
            for(double d2: d){
                System.out.print(d2+"\t");
            }
            System.out.println("");
        }
    }
    public void classes(){
        for(int i=0; i<neuronios.length; i++){
            
        }
    }
    
    public static void main(String[] args) {
        initNeuronios();
        treinamento();
        distancias();
    }   
}
