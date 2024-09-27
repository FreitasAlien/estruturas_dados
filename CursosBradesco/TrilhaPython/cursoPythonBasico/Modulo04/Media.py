notaA = float(input("Digite a primeira nota: "))
notaB = float(input("Digite a segunda nota: "))

#Equação, cálculo de média
mediaFinal = (notaA + notaB) / 2

#Verificação condicional
if mediaFinal >= 7.0:
    print("Média %.1f - Aprovado"% mediaFinal)
else:
    print("Média %.1f - Reprovado"% mediaFinal)
