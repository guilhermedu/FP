def countdown(N):
    print(N)
    if (N>0):
       countdown(N-1)

def main():
    N=int(input("Qual o valor de N?"))
    countdown(N)
main()


