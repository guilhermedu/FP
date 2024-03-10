X1=float(input("Qual a nota tp1?"))
X2=float(input("Qual a nota tp2?"))
X3=float(input("Qual a nota da prática?"))
X=((X1+X2)/ 2)*0.34
Y=X3*0.66
N=X+Y
print(N)
if N<9.5:
    Atp=float(input("Qual a nota tp?"))
    Ap=float(input("Qual a nota da prática?"))
    TP=((Atp)/ 2)*0.34
    P=Ap*0.66
    R=TP+P
    print(R)
    if R>9.5:
       print("Parabéns passou à cadeira!") 
    else:
        print("Vai ter que estudar mais!")
else:
    print("Parabéns passou à cadeira!")