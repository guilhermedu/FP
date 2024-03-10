def fundiv (numero):
	if numero == 0:
		print ("Error")
	elif numero == 1:
		print ("O número 1 tem apenas 1 divisor")
	else:
		divisores = 0
		for i in range(1, numero + 1):
			if numero%i == 0:
				print(i, "é divisor de", numero)
				divisores += 1
		
	if (divisores == numero):
			print(numero, "é perfeito")
	elif (divisores < numero):
			print(numero, "é deficiente")
	else:
			print(numero, "é abundante")

numero = int(input("Introduza o seu número: "))
fundiv(numero)
