#include <bits/stdc++.h> //Importa todas as bibliotecas padrão do C++ que o código use.
using namespace std;
 
//Rafael Francisco Ferreira - 3º ano C.C. Unespar
//Implementação do algorítimo de Huffman para a matéria de Organização e Estrutura de Dados.
 
//Um nó da arvore de Huffman
struct NohHeapMin
{
    char dados;                // um dos caracteres de entrada
    unsigned freq;             // frequência do caractere
    string bin;
    NohHeapMin *left, *right; // filho da esquerda e da direita
 
    NohHeapMin(char dados, unsigned freq)
    {
        left = right = NULL;
        this->dados = dados;
        this->freq = freq;
    }
};
 
// Para comparar os nós da heap min
struct compare
{
    bool operator()(NohHeapMin* l, NohHeapMin* r)
    {
        return (l->freq > r->freq);
    }
};
 
// Printa os códigos da arvore de huffman partindo da raiz
void mostraCodigos(struct NohHeapMin* raiz, string str)
{
    if (!raiz)
        return;
 
    if (raiz->dados != '$')
        cout << raiz->dados << ": " << str << "\n";
 
	raiz->bin = str; 
 
    mostraCodigos(raiz->left, str + "0");
    mostraCodigos(raiz->right, str + "1");
}

void mostraString(struct NohHeapMin* raiz){
	if (!raiz)
		return;
	if(raiz->dados != '$'){
		cout<<raiz->bin<<"\t: "<<raiz->dados<<endl;
	}
	mostraString(raiz->left);
	mostraString(raiz->right);
}
 
// A função principal que constrói a arvore de Huffman e printa os codigos
void Huffman(char dados[], int freq[], int tam)
{
    struct NohHeapMin *left, *right, *top;
 
    // Cria uma heap min e insere os dados de data[]
    priority_queue<NohHeapMin*, vector<NohHeapMin*>, compare> minHeap; //HEAP MIN
    for (int i = 0; i < tam; i++)
        minHeap.push(new NohHeapMin(dados[i], freq[i]));
 
    // Itera enquanto o tamanho da heap não chega a 1
    while (minHeap.size() != 1)
    {
        // Extrai os dois nós de frequencia mínima da heap min
        left = minHeap.top();
        minHeap.pop();
 
        right = minHeap.top();
        minHeap.pop();
 
        // Cria um novo nó interno com frequencia igual a da
        //soma das frequencias dos dois nós. Faz dos dois nós estraidos 
        //os filhos da esquerda e da direita desse novo nó.
        //Adiciona este nó na heap min
        //'$' é um valor especial para nós internos, não usado
        top = new NohHeapMin('$', left->freq + right->freq);
        top->left = left;
        top->right = right;
        minHeap.push(top);
    }
 
    // Printa os codigos usando a arvore de Huffman criada acima
    mostraCodigos(minHeap.top(), "");
    cout<<"\nCaracteres descodificados: "<<endl;
    mostraString(minHeap.top());
}
 
//main
int main()
{
	string palavra = "baecedeac!"; //palavra do problema passado em sala
	cout<<"Codificar: "<<palavra<<endl;
	cout<<"\nCaracteres codificados:"<<endl;
    char arr[] = {'a', 'b', 'c', 'd','e', '!'}; //caracteres passados por parametro
    int freq[] = {2, 1, 2, 1, 3, 1}; //frequencia dos caracteres passados por parametro
    int tam = sizeof(arr);
 
    Huffman(arr, freq, tam);
 
 	system("pause");
    return 0;
}
