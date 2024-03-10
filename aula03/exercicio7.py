def tar(r):
    if r<=1000:
        R=0.1*r
    elif 1000<r<=2000:
        R=0.2*r-100
    else:
        R=0.3*r-300
    return R
def main():
    x=int(input("Qual o valor de X?"))
    F=tar(x)
    print(F)

main()   