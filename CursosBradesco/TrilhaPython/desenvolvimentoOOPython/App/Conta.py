class Conta:
    def __init__(self, titular, numero, saldo):
        self._saldo = saldo #o uso do '_' tornam os modificadores privados
        self._numero = numero
        self._titular = titular

    @property
    def saldo(self):
        return self._saldo

    @saldo.setter
    def saldo(self, saldo):
        if saldo < 0:
            print("O saldo não pode ser negativo!")
        else:
            self._saldo = saldo


    def saque(self, valor):
        if valor > self.saldo:
            print("Saldo Insuficiente!")
        else:
            self.saldo -= valor
            print("Saldo realizado!")

    def deposito(self, valor):
        self.saldo += valor

    def extrato(self):
        print("Cliente:", self._titular, "\nNúmero da Conta:", self._numero, "\nSaldo:", self.saldo, )

