def primesUpto(n):
    primes = {x for x in range(2, n+1)}
    for p in range(2, int(n**0.5)+1):
        primes -= {x for x in range(p**2,n+1,p)}
    return primes

s=primesUpto(30)
print(s)
print(len(s))