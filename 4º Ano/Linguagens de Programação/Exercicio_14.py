#Rafael Francisco Ferreira - 4º Ano C.C. Unespar
lista = []

#Preenche a lista com numeros de 1 a 10
for i in range(1,11):
  lista.append(i)

#Remove elemento na posição 2
lista.pop(2) 

#Remove elemento de número 5
lista.remove(5) 

#Adiciona elementos 11 e 12 ao fim da lista
lista.append(11)
lista.append(12)

#Insere elemento 0 no início da lista
lista.insert(0,0)

#Mostra numero de elementos da lista
print("Numero de elementos na lista: ", len(lista))

print(lista)