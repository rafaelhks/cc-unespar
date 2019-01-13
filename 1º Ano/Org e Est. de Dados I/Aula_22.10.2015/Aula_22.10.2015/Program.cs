using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula_22._10._2015
{
    class Program
    {
        static void Main(string[] args)
        {
            //PILHA INICIO***
            //Crio a pilha
            //Stack<string> pilha = new Stack<string>();

            //Insere dados na pilha
            //pilha.Push("Fernando");
            //pilha.Push("Carlos");
            //pilha.Push("Ana");
            //pilha.Push("João");

            //Remove um elemento da pilha
            //pilha.Pop();

            //Faz uma varredura na coleção(pilha) e enquanto houver elementos ele escreve no console
            //foreach (var item in pilha)
            //{
            //    //Escreve o elemento atual(item) no console 
            //    Console.WriteLine(item);
            //}
            //PILHA FIM ***

            //***********************************************
            //FILA
            //Queue<int> fila = new Queue<int>();

            //fila.Enqueue(1);
            //fila.Enqueue(2);
            //fila.Enqueue(3);
            //fila.Enqueue(4);

            //fila.Dequeue();

            //foreach (var item in fila)
            //{
            //    Console.WriteLine(item);
            //}

            //Mostra o elemento com prioridade de saida
            //Console.WriteLine(fila.Peek());

            //***********************************************
            //Exercicio (sala)
            //Queue<string> filaexe = new Queue<string>();
            //string nome = "";
            //do
            //{
            //    Console.Write("Digite um valor: ");
            //    nome = Console.ReadLine();
            //    filaexe.Enqueue(nome);
            //} while (nome != "fim");

            //filaexe.Dequeue();

            //foreach (var item in filaexe)
            //{
            //    Console.WriteLine(item);
            //}

            //***********************************************
            //LISTAS (List<T>)

            //Cria estrutura da Lista
            //List<int> lista = new List<int>();

            //lista.Add(100);//Insere um elemento na lista
            //lista.Add(200);
            //lista.Add(300);
            //lista.Add(400);

            //lista.Remove(200);//Remove pelo valor
            //lista.RemoveAt(1);//Remove pelo indice que começa em 0 ZERO
            //int quantElementos = lista.Count;// Count retorna a quantidade de elementos da lista
            //lista.Clear(); //Limpa a lista


            //Console.WriteLine("Valores da lista");
            
            //for (int i = 0; i < lista.Count; i++)
            //{
            //    Console.WriteLine(lista[i]);
            //}

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
            }
            foreach (var item in exerciciopilha)
            {
                Console.WriteLine(item);
            }











            //Mantem a tela aberta
            Console.Read();
            


        }
    }
}
