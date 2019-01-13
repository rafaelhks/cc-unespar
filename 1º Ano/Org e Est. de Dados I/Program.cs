using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1 {
    class Program {
        static void Main(string[] args) {

            Console.WriteLine("----JOGO DA VELHA----\n" + "Jogador 1: 'X' " + "\t\tJogador 2: 'O' \n");

            string[,] cruzada = new string[3, 3]
            {
                {"*","*","*"} , {"*","*","*"} , {"*","*","*"}
            };

            //numeros[0, 0] = 23;
            //numeros[0, 1] = 23;
            //numeros[0, 2] = 23;
            //numeros[1, 0] = 23;
            //numeros[1, 1] = 23;
            //numeros[1, 2] = 23;
            //numeros[2, 0] = 23;
            //numeros[2, 1] = 23;
            //numeros[2, 2] = 23;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Console.Write(" " + cruzada[i, j] + " ");
                }
                Console.WriteLine();
            }

            Console.ReadKey();
        }
    }
}
