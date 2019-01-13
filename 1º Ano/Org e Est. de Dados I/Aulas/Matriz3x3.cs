using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication12
{
    class Program
    {
        static void Main(string[] args)
        {
            //Matriz 3x3
            int[,] numeros = new int[3,3] 
            {
                {1,2,3} , {4,5,6} , {7,8,9}
            };

            ////Substitui o valor de um elemento pela sua posição
            //numeros[1, 1] = 23;

            ////Escrever um número da matriz pela sua posição com indice iniciando em 0,0
            //Console.WriteLine(numeros[1,1]);

            //Escreve a matriz no formato 3x3
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(numeros[i, j] + " ");
                }
                Console.WriteLine();
            }

            Console.ReadKey();
        }
    }
}
