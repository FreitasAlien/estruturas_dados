qtd = 0
soma = 0
media = 0

valor = float(input("Digite um valor: "))

while valor > 0.0: #Enquanto 'valor' for positivo, o laço repetirá
    soma = soma + valor
    qtd = qtd + 1
    #Entrada dos valores digitados
    valor = float(input("Digite um valor: "))

#Atualizando o valor da media
media = soma / qtd

print("\nTotal da Soma: ", soma)
print("\nQuantidade de valores digitados: ", qtd)
print("\nMédia dos Valores: %.1f", media)