x1=float(input("Número 1:"))
x2=float(input("Número 2:"))
x3=float(input("Número 3:"))

if x1>x2 and x2>x3:
    print(x1)
elif x2>x1 and x2>x3:
    print(x2)
else:
    print(x3)
    