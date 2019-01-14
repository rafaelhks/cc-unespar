#Rafael Francisco Ferreira - 4º Ano C.C. Unespar
valores = []

def inserir():
  valor = int(input("\nDigite o valor a ser inserido:"))
  if(len(valores)<=8):
    valores.append(valor)
  else:
    print("\n\nErro. Já foram inseridos 8 valores!")

def media():
  if len(valores)>0:
    soma = 0
    for v in valores:
      soma+=v
  
    res = soma/len(valores)
    print("\nA média dos valores: ",valores,"\né: ",res)
  else:
    print("\nNão é possível fazer média pois nenhum valor foi inserido!")

def soma():
  if len(valores)>0:
    res = 0
    for v in  valores:
      res+=v
    
    print("\nA soma dos valores: ",valores,"\né igual a: ",res)
  else:
    print("\nNão é possível fazer soma pois nenhum valor foi inserido!")

def menorValor():
  if len(valores)>0:
    valores.sort()
    print("\nO menor valor da lista: ",valores,"\né: ",valores[0])
  else:
    print("\nErro! Não há elementos na lista.")

def maiorValor():
  if len(valores)>0:
    valores.sort()
    print("\nO maior valor da lista: ",valores,"\né: ",valores[len(valores)-1])
  else:
    print("\nErro! Não há elementos na lista.")

op = True
while op:
    print("\n1. Inserir valores\n2. Calcular média\n3. Calcular soma\n4. Calcular menor valor\n5. Calcular maior valor")
    
    op = input("Digite uma opção:")
    
    if (op=="1"):
      inserir()
    elif (op=="2"):
      media()
    elif op=="3":
      soma()
    elif op=="4":
      menorValor()
    elif op=="5":
      maiorValor()
    else:
       print("\nOpção inválida!")