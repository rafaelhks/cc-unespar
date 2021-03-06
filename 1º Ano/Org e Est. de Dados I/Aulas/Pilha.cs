﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            //pilha de inteiros
            Stack<int> pilha = new Stack<int>();

            pilha.Push(1);
            pilha.Push(2);
            pilha.Push(3);
            pilha.Push(4);*/

            //pilha de nomes
            Stack<string> pilha = new Stack<string>();//Crio a pilha

            //Insere dados na pilha
            pilha.Push("Fernando");
            pilha.Push("Carlos");
            pilha.Push("Ana");
            pilha.Push("João");
            //Remove um elemento da pilha
            pilha.Pop();
            //Faz uma varredura na coleção(pilha) e enquanto houver elementos ele escreve na tela
            foreach (var item in pilha)
            {
                //Escreve o elemento atual(item) na tela
                Console.WriteLine(item);
            }
            //Mantem a tela aberta
            Console.Read();
        }
    }
}
