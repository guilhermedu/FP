X1=float(input("Qual a distancia percorrida de x1?"))
x2=float(input("Qual a distancia percorrida de x2?"))

Y1=float(input("Qual a distancia percorrida de y1?"))
y2=float(input("Qual a distancia percorrida de y2?"))

t1=int(input("Qual o tempo da 1 viagem?"))
t2=int(input("Qual o tempo da 2 viagem?"))

X= Y1 - X1
Vm1=X/t1

Y=y2-Y1
Vm2=Y/t2

v=(Vm1+Vm2)/2

print("Velocidade média" , v,"m/s")


