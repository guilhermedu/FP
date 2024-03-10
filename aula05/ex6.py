def countdigit(s):
    n=0
    for c in s:
        if c.isdigit():
               n+=1
    return n 


print(countdigit("12345 maria ines maria rita"))

