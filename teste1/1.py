def main():
    A=0;
    B=0;
    votonulo=0;
    while True:
        C=input("Voto: ")
        if (C=="A"):
            A=A+1;
        elif (C=="B"):
            B=B+1;
        elif(C=="END"):
            break;
        else:
            votonulo=votonulo+1;
    print("Nulos:",votonulo);
    percentagemA=(A/(A+B))*100;
    percentagemB=(B/(A+B))*100;
    print("A: {:.1f}%".format(percentagemA));
    print("B: {:.1f}%".format(percentagemB));

main()


        

