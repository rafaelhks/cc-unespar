using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication11
{
    class Program
    {
        static void Main(string[] args)
        {
            int cont = 5;
            int[] numeros = new int[cont];
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 4;
            numeros[4] = 5;


            int[] valor = new int[3]
                {1,2,3};
            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine(valor[i]);
            }

            Console.ReadKey();
        }
    }
}
