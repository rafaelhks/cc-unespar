using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            //Simulador de Memória Cache - Traalho de Arq. e Org. de Computadores - Unespar 2016

            //RAFAEL FRANCISCO FERREIRA e LUÍS FERNANDO SIVIRINO GASPAR

            InitializeComponent();
            for (int i = 0; i < 4; i++)
            {
                mc.Add(null);
                mc2.Add(null);
            }
            for (int j = 0; j < 4; j++)
            {
                listBox3.Items.Add(j);
            }
            comboBox1.SelectedIndex = 0;//Seleciona o método FIFO como padrão
        }

        //Lista que armazena os valores da Memória Princial
        public static List<string> mp = new List<string>(); 
        //Listas que armazenam o bloco da Memória Princial em uma linha da cache
        public static List<string> mc = new List<string>(); 
        public static List<string> mc2 = new List<string>();
        public int i = 0;//contador auxiliar
        Random rnd = new Random(DateTime.Now.Millisecond);

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (i > 0)
            {
                MessageBox.Show("Não é possível gerar novos endereços após\n o preenchimento da cache ter sido iniciado!");
            }
            else
            {
                this.Controls.Add(listBox1);

                listBox1.MultiColumn = false;

                listBox1.BeginUpdate();

                listBox1.Items.Clear();
                mp.Clear();
                for (int i = 0; i < 1024; i++) //Adiciona 1024 valores à Memória Principal
                {
                    int n = rnd.Next(0, 10000);
                    if (mp.Contains(Convert.ToString(n))) //Impede que existam dois valores iguais na Memoria Principal
                    {
                        n = rnd.Next(0, 10000);
                    }
                    mp.Add(Convert.ToString(n));
                }

                foreach (var item in mp)
                {
                    listBox1.Items.Add(item); //Mostra os valores na listBox1
                }

                listBox1.EndUpdate();
            }        
                      
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Controls.IndexOf(listBox2);
            int sIndex = comboBox1.SelectedIndex; //Pega o indice da opção selecionada

            //Gera novos valores aleatórios para a linha da cache a ser modificada
            int sub = rnd.Next(0, 10000);
            int sub2 = rnd.Next(0, 10000);
            bool hitmiss = true;

            if (mc.Contains(Convert.ToString(sub)) && mc2.Contains(Convert.ToString(sub2)))
            {
                hitmiss = true;
            }
            else { hitmiss = false; };

            if (mp.Contains(Convert.ToString(sub))) //Impede que existam valores iguais os da Memoria Principal
            {
                sub = rnd.Next(0, 10000);     
            }else if (mp.Contains(Convert.ToString(sub2))) 
                  {
                      sub2 = rnd.Next(0, 10000);
                  }

            int c = mc.Count(); //contagem auxiliar
            int p = mp.Count();

            listBox2.MultiColumn = false;

            if (p == 0 || c == 0 && mc[0] == null && mc[1] == null && mc[2] == null && mc[3] == null)
            {
                MessageBox.Show("A memória cache está vazia e não há como modificar.");
            }
            else if (sIndex == -1)
            {
                MessageBox.Show("Nenhum método selecionado.\nSelecione um dos métodos na caixa ''Método de substituição''.");
            }
            else if (c != 4 || mc[0] == null || mc[1] == null || mc[2] == null || mc[3] == null)
            {
                MessageBox.Show("A Cache deve estar cheia para que se possa utilizar a substituição!");
            }
            else
            {
                //FIFO
                if (sIndex == 0)
                {
                    //Descobre as strings nas linha da Cache
                    string vl1 = mc[0];
                    string vl2 = mc2[0];
                    //Descobre o indice dos valores do bloco
                    //correspondente à linha da cache a ser modificada
                    int ind1 = mp.IndexOf(vl1);
                    int ind2 = mp.IndexOf(vl2);

                    listBox2.Items.Clear(); //Limpa a listBox2 (Cache)
                    
                    //Substitui os valores da linha da cache por valores aleatórios gerados
                    mc.RemoveAt(0);
                    mc.Insert(0, Convert.ToString(sub));
                    mc2.RemoveAt(0);
                    mc2.Insert(0, Convert.ToString(sub2));

                    string zero = mc[0] + " " + mc2[0];
                    string um = mc[1] + " " + mc2[1];
                    string dois = mc[2] + " " + mc2[2];
                    string tres = mc[3] + " " + mc2[3];

                    //Mostra a cache modificada na listBox2
                    listBox2.Items.Insert(0, zero);
                    listBox2.Items.Insert(1, um);
                    listBox2.Items.Insert(2, dois);
                    listBox2.Items.Insert(3, tres);

                    //Move o valor modificado para o fim da lista
                    //pois ele acabou de entrar e não é mais o "First In"
                    mc.RemoveAt(0);
                    mc.Insert(3, Convert.ToString(sub));
                    mc2.RemoveAt(0);
                    mc2.Insert(3, Convert.ToString(sub2));

                    //Atualiza lista de posições apenas para melhor entendimento do funcionamento
                    listBox3.Items.Clear();
                    listBox3.Items.Insert(0, 3);
                    listBox3.Items.Insert(1, 0 + " ^");
                    listBox3.Items.Insert(2, 1 + " ^");
                    listBox3.Items.Insert(3, 2 + " ^");

                    //Seleciona a linha modificada para melhor visualização
                    int index = listBox2.FindStringExact(Convert.ToString(sub) + " " + Convert.ToString(sub2));
                    int indpos = listBox3.FindStringExact(Convert.ToString(index));
                    listBox2.SetSelected(index, true);
                    listBox3.SetSelected(1, true);
                    
                    //write-back
                    if (hitmiss == true) //HIT
                    {
                        listBox4.Items.Clear();
                        listBox4.Items.Insert(0, "Hit!");
                        listBox4.SetSelected(0, true);
                    }
                    else if (hitmiss == false) //MISS
                    {
                        listBox4.Items.Clear();
                        listBox4.Items.Insert(0, "Miss!");
                        listBox4.SetSelected(0, true);

                        listBox1.Items.Clear();

                        //Substitui os valores daquela posição modificada na RAM
                        mp.RemoveAt(ind1);
                        mp.Insert(ind1, mc[3]);
                        mp.RemoveAt(ind2);
                        mp.Insert(ind2, mc2[3]);

                        foreach (var item in mp)
                        {
                            listBox1.Items.Add(item);
                        }
                        //Seleciona o bloco modificado na RAM
                        int indp1 = listBox1.FindStringExact(Convert.ToString(sub));
                        int indp2 = listBox1.FindStringExact(Convert.ToString(sub2));
                        listBox1.SetSelected(indp1, true);
                        listBox1.SetSelected(indp2, true);
                    }
                    //write-back
                }

                //ALEATÓRIO
                else if (sIndex == 1)
                {
                    listBox3.Items.Clear();
                    listBox3.Items.Insert(0, 0);
                    listBox3.Items.Insert(1, 1);
                    listBox3.Items.Insert(2, 2);
                    listBox3.Items.Insert(3, 3);

                    var a = rnd.Next(0, 4);
                    //Descobre as strings nas linha da Cache
                    string vl1 = mc[a];
                    string vl2 = mc2[a];

                    //Descobre o indice dos valores do bloco
                    //correspondente à linha da cache a ser modificada
                    int ind1 = mp.IndexOf(vl1);
                    int ind2 = mp.IndexOf(vl2);

                    listBox2.Items.Clear();//Limpa a listBox2 (Cache)

                    //Substitui os valores da linha da cache por valores aleatórios gerados
                    mc.RemoveAt(a);
                    mc.Insert(a, Convert.ToString(sub));
                    mc2.RemoveAt(a);
                    mc2.Insert(a, Convert.ToString(sub2));

                    //Mostra a cache modificada na listBox2
                    listBox2.Items.Clear();
                    listBox2.Items.Insert(0, mc[0] + " " + mc2[0]);
                    listBox2.Items.Insert(1, mc[1] + " " + mc2[1]);
                    listBox2.Items.Insert(2, mc[2] + " " + mc2[2]);
                    listBox2.Items.Insert(3, mc[3] + " " + mc2[3]);

                    //Seleciona a linha modificada para melhor visualização
                    int index = listBox2.FindStringExact(Convert.ToString(sub) + " " + Convert.ToString(sub2));
                    int indpos = listBox3.FindStringExact(Convert.ToString(index));
                    listBox2.SetSelected(index, true);
                    listBox3.SetSelected(indpos, true);

                    //write-back
                    if (hitmiss == true) //HIT
                    {
                        listBox4.Items.Clear();
                        listBox4.Items.Insert(0, "Hit!");
                        listBox4.SetSelected(0, true);
                    }
                    else if (hitmiss == false) //MISS
                    {
                        listBox4.Items.Clear();
                        listBox4.Items.Insert(0, "Miss!");
                        listBox4.SetSelected(0, true);
                        listBox1.Items.Clear();

                        //Substitui os valores daquela posição modificada na RAM
                        mp.RemoveAt(ind1);
                        mp.Insert(ind1, mc[a]);
                        mp.RemoveAt(ind2);
                        mp.Insert(ind2, mc2[a]);

                        foreach (var item in mp)
                        {
                            listBox1.Items.Add(item);
                        }
                        //Seleciona o bloco modificado na RAM
                        int indp1 = listBox1.FindStringExact(Convert.ToString(sub));
                        int indp2 = listBox1.FindStringExact(Convert.ToString(sub2));
                        listBox1.SetSelected(indp1, true);
                        listBox1.SetSelected(indp2, true);
                    }
                    //write-back
                }
            }
        }
        private void label1_Click(object sender, EventArgs e)
        {

        }


        private void label1_Click_1(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            int c = mc.Count();
            if (mp.Count() == 0)
            {
                MessageBox.Show("A memória principal está vazia!\nClique no botão ''Gerar Endereços''.");

            }
            else if (i <  4 || mc[0] == null || mc[1] == null || mc[2] == null || mc[3] == null)
            {
                var aleatorio = rnd.Next(0, mp.Count - 1);
                var randN = mp[aleatorio];

                this.Controls.Add(listBox2);

                listBox2.MultiColumn = false;

                listBox2.BeginUpdate();

                //Forma os blocos
                int ind = mp.IndexOf(randN);
                string bloco = null;
                if (ind % 2 == 0 || ind == 0) //Se for par
                {
                    bloco = mp[ind + 1];
                }
                else if (ind % 2 != 0) //Se for ímpar
                {
                    bloco = mp[ind - 1];
                }

                int M_aleatorio = rnd.Next(0, 4); //Escolhe uma posição aleatória

                //Substitui na posiçao(MAP. ASSOC.)
                mc[M_aleatorio] = randN;
                mc2[M_aleatorio] = bloco;

                //Imprime a Cache atualizada
                listBox2.Items.Clear();

                listBox2.Items.Insert(0, mc[0] + " " + mc2[0]);
                listBox2.Items.Insert(1, mc[1] + " " + mc2[1]);
                listBox2.Items.Insert(2, mc[2] + " " + mc2[2]);
                listBox2.Items.Insert(3, mc[3] + " " + mc2[3]);
                listBox2.EndUpdate();

                int index = listBox1.FindStringExact(randN);
                listBox1.SetSelected(index, true);
                int index2 = listBox1.FindStringExact(bloco);
                listBox1.SetSelected(index2, true);
                i++;
            }
            else if (mc[0] != null || mc[1] != null || mc[2] != null || mc[3] != null)
            {
                MessageBox.Show("A Memória Cache está cheia!\nA partir de agora utilize o botão\nreferente à ''Leitura e modificação''.\n\nNão se esqueça de selecionar o método \nde substiuição no campo ''Método de substituição:''.");
            }
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {

        }

        private void listBox2_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void listBox3_SelectedIndexChanged_1(object sender, EventArgs e)
        {

        }

        private void listBox4_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}

