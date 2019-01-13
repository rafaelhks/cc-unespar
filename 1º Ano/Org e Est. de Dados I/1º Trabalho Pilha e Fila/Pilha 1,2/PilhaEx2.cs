using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication5
{
    class Program
    {
        static void Main(string[] args)
        {
            //Pilha
            Stack<int> pilha = new Stack<int>(); //Crio a pilha

            //Incluo elementos na pilha
            pilha.Push(1);
            pilha.Push(2);
            pilha.Push(3);
            pilha.Push(4);

            //Rotina Pop() para desempilhar dois elementos da pilha
            pilha.Pop();
            pilha.Pop();

            foreach (var item in pilha)
            {
                Console.WriteLine(item);
            }

            Console.Read();

        }
    }
}
