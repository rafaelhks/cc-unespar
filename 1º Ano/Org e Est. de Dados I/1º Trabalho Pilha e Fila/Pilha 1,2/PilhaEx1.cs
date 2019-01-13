using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            //pilha
            Stack<int> pilha = new Stack<int>(); //crio uma nova pilha vazia.

            //inclui (empilha) um elemento da pilha
            pilha.Push(1);
            pilha.Push(2);
            pilha.Push(3);
            pilha.Push(4);

            pilha.Pop(); //exclui (desempilha) um elemento da pilha

            foreach (var item in pilha) //retorna se a pilha está vazia ou não
            {
                Console.WriteLine(item); 
            }
            Console.WriteLine(pilha.Peek()); //retorna o elemento que está no topo da pilha sem retirá - lo da pilha.
            pilha.Clear(); //libera a memória alocada pela pilha
            Console.Read(); //mantém a tela aberta
        }
    }
}
