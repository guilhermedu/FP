def mdc(a, b):
	c = b
	if (a % b != 0):
		r = a % b
		c = mdc(b, r)
	return c

def main():
    a=int(input("Qual o valor de a:"))
    b=int(input("Qual o valor de b:"))
    X=mdc(a,b)
    print(X)
main()