def maximo(x,y):
    if x>y:
        return x
    else:
        return y


def main():
    X=int(input("Qual o valor de x:"))
    Y=int(input("Qual o valor de y:"))
    máximo=maximo(X,Y)
    print("O máximo é :" , máximo)
   
main()