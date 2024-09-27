class Main:
    pass
print("Testando o Projeto")

from Cliente import Cliente
from Conta import Conta

c1 = Cliente("Gustavo","77880000000")
conta = Conta("Gustavo", 200, 1500.0)

print(c1)

print(c1.nome, "e", c1.telefone)

conta.deposito(500)
conta.saque(50000)
conta.extrato()



