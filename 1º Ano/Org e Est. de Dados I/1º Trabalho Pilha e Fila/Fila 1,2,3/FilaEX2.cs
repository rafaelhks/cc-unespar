using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication7
{
    class Program
    {
        static void Main(string[] args)
        {
            //Fila
            Queue<int> fila = new Queue<int>();

            fila.Enqueue(1);
            fila.Enqueue(2);
            fila.Enqueue(3);
            fila.Enqueue(4);
            fila.Enqueue(5);
            fila.Enqueue(6);
            fila.Enqueue(7);
            fila.Enqueue(8);
            fila.Enqueue(9);
            fila.Enqueue(10);

            List<int> lista = new List<int>(); //Lista
            foreach (var item in fila)
            {
                lista.Add(item);
            }
            fila.Clear();
            //Excluo os números ímpares
            lista.Remove(1);
            lista.Remove(3);
            lista.Remove(5);
            lista.Remove(7);
            lista.Remove(9);
            foreach (var item in lista)
            {
                fila.Enqueue(item);
            }
            foreach (var item in fila)
            {
                Console.WriteLine(item);//Escreve na tela
            }

            Console.Read();
        }
    }
}
