def lerNotas(): #Função de entrada de dados
    n=float(input("Digite uma nota do aluno(a): "))
    return n

def resultado(n1, n2): #Função que calcula e verifica a média
    media=(n1 + n2)/2
    print("Primeria nota: ", n1)
    print("Segunda nota: ", n2)
    print("Média: ", media, "Resultado: ", end ="") #'end' define o caractere que será utilizado no final da saída
    if media >= 7: #Verificação do resultado
        print("Aprovado")
    else:
        print("Reprovado")

nota1 = lerNotas()
nota2 = lerNotas()

resultado(nota1, nota2)