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
            //Exercicio para consulta

            Stack<int> exerciciopilha = new Stack<int>();

            exerciciopilha.Push(1);
            exerciciopilha.Push(2);
            exerciciopilha.Push(3);
            exerciciopilha.Push(4);
            exerciciopilha.Push(5);

            List<int> exerciciolista = new List<int>();

            foreach (var item in exerciciopilha)
            {
                exerciciolista.Add(item);
            }

            exerciciopilha.Clear();
            exerciciolista.Remove(2);

            foreach (var item in exerciciolista)
            {
                exerciciopilha.Push(item);
                Console.WriteLine(item);
            }
            
            Console.Read();
        }
    }
}
