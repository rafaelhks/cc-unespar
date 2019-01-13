using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculadora {
    class Program {
        static void Main(string[] args) 
        {
            //Inicio
            Console.WriteLine("_______________________________Calculadora_____________________________________\n");
            Console.WriteLine("                    Soma, Subtracao, Divisão e Multiplicação                 \n");
            Console.WriteLine("_____________________________________________________________________________");

            //Usuário digita o numero;
            Console.Write("Digite o primeiro número: ");
            double a = Convert.ToInt64(Console.ReadLine());

            //Usuário digita o segundo numero;
            Console.Write("Digite o segundo número: ");
            double b = Convert.ToInt64(Console.ReadLine());

            double RetornoMetodoSoma = Program.Soma(a, b);
            Console.WriteLine("\nSoma dos dois números: " + RetornoMetodoSoma + "\n");

            double RetornoMetodoDif = Program.Dif(a, b);
            Console.WriteLine("Diferença dos dois números: " + RetornoMetodoDif + "\n");

            double RetornoMetodoDiv = Program.Div(a, b);
            Console.WriteLine("Divisão dos dois números: " + RetornoMetodoDiv + "\n");

            double RetornoMetodoMult = Program.Mult(a, b);
            Console.WriteLine("Multiplicação dos dois números: " + RetornoMetodoMult + "\n");
        }

        //Método de soma;
        public static double Soma(double a, double b)
        {
            return a + b;
        }
        //Método de substração;
        public static double Dif(double a, double b) 
        {
            return a - b;
        }
        //Método de divisão;
        public static double Div(double a, double b) 
        {
            return a / b;
        }
        //Método de Multiplicação;
        public static double Mult(double a, double b) 
        {
            return a * b;
        }

    }
}

