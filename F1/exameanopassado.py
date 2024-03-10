from xmlrpc.client import TRANSPORT_ERROR


def lerficheiro():
    with open("/home/guilherme/Documentos/fp/F1/ep1.csv") as fin:
        lst=[]
        for l in fin:
            l=l.strip().split(";")
            lst.append(l)
        return lst

def registados(lst):
    lstordenada = sorted(lst, key= lambda t : t[2][0], reverse=False)
    return lstordenada

def imprimamatriculaassociadaaoNIF(lst):
    dic = {}
    for item in lst:
        if item[2] in dic.keys():
            dic[item[2]] = [dic[item[2]],item[0]]
        else:
            dic[item[2]] = item[0]
    return dic

def matrcval(s):
    if  len(s)==8\
        and s[0:2].isdigit() \
        and s[2]=="-"\
        and s[3:5].isalpha() \
        and s[5]=="-"\
        and s[6:8].isdigit():
        return True
    else:
        return False

def utilizaçaodoparque():
    lst=[]
    while True:
        matricula=input("Qual é a matricula?")
        if matrcval(matricula)==True:
            break
        else:
            print("A matricula não está correta")
    while True:
        tempo=int(input("Qual é o tempo? "))
        if tempo>0:
            break
        else:
            print("A tempo não está correto")
    lst.append((matricula,tempo))
    return lst




def main():
    lst =[]
    lst = lerficheiro()
    listaordenada = registados(lst)
    print(imprimamatriculaassociadaaoNIF(listaordenada))
    print(matrcval("12-AC-36"))
    print(matrcval("67-BH-98"))
    print(matrcval("12-12-12"))
    print(utilizaçaodoparque())
main()


