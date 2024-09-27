fruta = input("Digite o nome de uma fruta: ") #Usando input para entrada de dados
print(fruta)

nome = input("Digite o nome do funcionário: ")
codigo = int(input("Digite o código do funcionário: "))
salario = float(input("Digite o salário do funcionário: "))
ativo = True


print("Nome: %s"% nome)
print("Código: %d"% codigo)
print("Salário: %.2f"% salario)
print("Ativo: %r"% ativo)