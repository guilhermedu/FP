def evenThenOdd(s):
    return s[1::2]+s[0::2]

def diferentes(s):
    lst=[]
    for i in s:
        lst.append(i)
    while True:
        prev_lst=lst[:]
        i=1
        while i<len(lst):
            if lst[i-1]==lst[i]:
                lst.pop(i)
            i+=1
        if prev_lst == lst:
            break
    s=""
    s=s.join(lst)
    return s



def repeatnumber(n):
    lst=[]   
    for i in range(1,n+1):
        for y in range(i):
            lst.append(i)
    return lst


def findMaxIndex(lst):
    index = -1
    index_max=0
    maxi = lst[0]
    for c in lst:
        index +=1
        if c > maxi:
            maxi =c
            index_max = index
    return index_max


print(evenThenOdd("123456789"))

#test noduplicates function
print(diferentes("Mississippi"))
print(diferentes("zzzzzzzzz"))

#test repeatnumber function
print(repeatnumber(3))
print(repeatnumber(8))
print(repeatnumber(0))
print(repeatnumber(-3))

#test findMaxIndex function
print(findMaxIndex([1, 2, 3, 2, 1]))
print(findMaxIndex([4, 3, 2, 1]))
print(findMaxIndex([1, 2, 3, 4, 5]))
