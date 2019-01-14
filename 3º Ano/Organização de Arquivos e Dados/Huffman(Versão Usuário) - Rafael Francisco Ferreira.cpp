#include <bits/stdc++.h> //Importa todas as bibliotecas padrão do C++ que o código use.
using namespace std;

//					Rafael Francisco Ferreira - 3º ano C.C. Unespar
//Implementação do algorítimo de Huffman para a matéria de Organização e Estrutura de Dados.
//OBS: Aceita textos com espaços.
 
//Um nó da arvore de Huffman
struct NohHeapMin
{
    char dados;                // um dos caracteres de entrada
    unsigned freq;             // frequência do caractere
    string bin;
    NohHeapMin *left, *right; // filho da esquerda e da direita
 
    NohHeapMin(char letra, int freq)
    {
        left = right = NULL;
        this->dados = letra;
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
 
    // Cria uma heap min e insere os dados de dados[]
    priority_queue<NohHeapMin*, vector<NohHeapMin*>, compare> minHeap; //HEAP MIN
    for (int i = 0; i < tam; i++){
    	if(dados[i] != '\0' && freq[i] != '\0')
    		minHeap.push(new NohHeapMin(dados[i], freq[i]));
	}
 
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
    cout<<"\nCaracteres codificados: "<<endl;
    mostraCodigos(minHeap.top(), "");
    cout<<"\nCaracteres descodificados: "<<endl;
    mostraString(minHeap.top());
}
  
int contaFreq(char c, char *s){

	int num_vezes=0;
	int i=0;
	while(*s!='\0'){
		if(*s==c)
		{
			num_vezes++;
		}
		s++;
	}
	return num_vezes;
} 

//main
int main()
{
	inicio:
	cout<<"\t\\Algoritimo de Huffman - Rafael Francisco Ferreira/"<<endl;
	char palavra[2048];
	cout<<"\nInforme a palavra ou texto (Max: 2048): ";
	//cin>>palavra;
	gets(palavra);
	int tam = strlen(palavra);
	cout<<"\nPalavra/Texto: "<<palavra<<endl;

	int freq[tam];
	
	for(int i=0; i<tam; i++){
		freq[i] = contaFreq(palavra[i], palavra); //conta a frequência de cada caractere na palavra
	}	
	
	//Este for remove as letras repetidas e substitui por '\0'
	int i,j;
	for(i=0; i<tam; i++){
		int c=0;
		for(j=0; j<tam; j++){
			if (palavra[i] == palavra[j]) {//Se encontrar um caractere igual, incluindo ele mesmo
            	if (c == 0) {
                	//Muda o sentinela para 1 quando encontrar o primeiro igual
                	//que, no caso, é o próprio caractere
                	c = 1;
            	}else{
            		palavra[i] = '\0'; //caso haja mais de uma ocorrencia, muda para '\0'
                	freq[i] = '\0';
				}
        	}
		}
	}
    
    //Chamada do método principal
	Huffman(palavra, freq, tam);
 	
 	system("pause");
	
    return 0;
}
