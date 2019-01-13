using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication8
{
    class Program
    {
        //Trabalho Bimestral de Org. e Estr. de Dados - 26/11/2015 
        //C.C. Unespar - 1º Ano
        //Aluno: Rafael Francisco Ferreira
        static void Main(string[] args)
        {
            CarregaCidades();
            //Indice();
            //Concatenar();
            //TrocarDePosição();
            //Copiar();
            //RemovePeloValor();
            //RemovePeloIndice();
            //Adicionar();
        }
        //Crio a lista global
        static List<string> Cidades = new List<string>();

        static void CarregaCidades()
        {
            //Adiciono elementos à lista
            Cidades.Add("Apucarana");
            Cidades.Add("Arapongas");
            Cidades.Add("Araucária");
            Cidades.Add("Cascavel");
            Cidades.Add("Curitiba");
            Cidades.Add("Foz do Iguaçu");
            Cidades.Add("Guaratuba");
            Cidades.Add("Londrina");
            Cidades.Add("Maringá");
            Cidades.Add("Ponta Grossa");
            //Ordena a lista em ordem alfabética
            Cidades.Sort();
        }


        //Método para localizar elementos pela posição(indice) e imprimir seu valor
        public static void Indice()
        {        
                Console.WriteLine(Cidades[4]);  
        }

        //Método que concatena um elemento escolhido na lista com o seu estado (UF)
        public static void Concatenar()
        {
            
            foreach (var item in Cidades) //Concatena todos os elementos da lista
            {
                Console.WriteLine(item + " - PR");
            }
        }

        //Método que troca duas cidades de posição entre eles
        public static void TrocarDePosição()
        {
            //Troca dois elementos de posição
            Cidades[0] = "Curitiba";
            List<string> Troca = new List<string>();
            foreach (var item in Cidades)
            {
                Troca.Add(item); //Importo os elementos da lista Cidades
            }
            Troca[4] = "Apucarana";

            foreach (var item in Troca)
            {
                Cidades.Add(item); //Importo os elementos da lista Troca
                Console.WriteLine(item);
            }

        }

        //Método que copia os elementos da lista para uma segunda lista criada
        public static void Copiar()
        {
            List<string> Cidades2 = new List<string>(); //Crio a nova ista
            foreach (var item in Cidades)
            {
                Cidades2.Add(item); //Importo os elementos da lista Cidades
                Console.WriteLine(item);
            }

        }

        //Método que remove um elemento da lista pelo seu valor
        public static void RemovePeloValor()
        {
            Cidades.Remove("Arapongas"); //Remove a cidade pelo nome(valor da string)
            foreach (var item in Cidades)
            {
                Console.WriteLine(item);
            }
        }

        //Método que remove um elemento da lista pelo seu indice
        public static void RemovePeloIndice()
        {
            Cidades.RemoveAt(3); //Remove pelo indice
            foreach (var item in Cidades)
            {
                Console.WriteLine(item);
            }
        }

        //Método para adicionar um novo elemento à lista
        public static void Adicionar()
        {
            Cidades.Add("Ipanema"); //Adiciona uma nova cidade à lista
            foreach (var item in Cidades)
            {
                Console.WriteLine(item);
            }
        }

        }
}
