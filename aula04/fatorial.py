def fatorial(n):
    if n < 0:
        return "not defined"
    res=n
    while n>1:
        res=res*(n-1)
        n=n-1
        return res
