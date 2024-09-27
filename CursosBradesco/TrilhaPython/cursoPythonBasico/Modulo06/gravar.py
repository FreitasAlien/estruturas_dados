arquivo = open('arqText.txt', 'w')

arquivo.write("Curso Python \n")
arquivo.write("Aula Prática\n")

arquivo.close()

#Leitura do arquivo de Texto

leitura=open('arqText.txt', 'r')
print(leitura.read())
leitura.close()