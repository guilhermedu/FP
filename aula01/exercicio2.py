x1=float(input("Etapa inicial"))
x2=float(input("Etapa final"))

y1=float(input("Etapa inicial"))
y2=float(input("Etapa final"))

t1=float(input("Qual o tempo da 1 viagem"))
t2=float(input("Qual o tempo da 2 viagem"))

X= x2 - x1
Vm1=X/t1

Y= y2 - y1
Vm2=X/t2

V=(Vm1+Vm2) / 2
print("Velocidade média" , V)