from audioop import avg


def inputFloatList():
    lst=[]
    while True:
       x=input("valores?")
       if x!="":
        lst.append(x)
       else:
        break
    return lst
    
def countLower(lst, V):
    t=0
    for i in lst:
        if i < V:
            t+=1
    return t  

def minmax(lst):
    minimo=lst[0]
    maximo=lst[0]
    for n in lst:
        if n > maximo:
            n = maximo
        elif n < minimo:
            n = minimo
    return minimo , maximo



def main():
    lst=inputFloatList()
    print(lst)
    V=input("valor?")
    low=countLower(lst,V)
    print(low)
    m=minmax(lst)
    print (m)
main()