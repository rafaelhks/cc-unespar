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
            //Crio a fila
            Queue<int> fila = new Queue<int>();

            //Insere dados na fila
            fila.Enqueue(1);
            fila.Enqueue(2);
            fila.Enqueue(3);
            fila.Enqueue(4);

            //Remove um elemento da fila
            fila.Dequeue();

            //Escreve na tela os elementos restantes
            foreach (var item in fila)
            {
                Console.WriteLine(item);
            }

            //Mostra quem será o próximo a sair da fila
            Console.WriteLine(fila.Peek());

            //Mantem a tela aberta
            Console.Read();
        }
    }
}
