x1 = float(input("valor de x1: "))
x2 = float(input("valor de x2: "))
x3 = float(input("valor de x3: "))

def maximo (x1, x2):
	if x1 > x2:
		return x1
	else:
		return x2

def maximo2 (x1, x2, x3):
	if x3 > maximo(x1,x2):
		return x3
	else:
		return maximo(x1,x2)

print ("O maior número dos três número é", maximo2(x1,x2,x3))