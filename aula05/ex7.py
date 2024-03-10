def shorten(s):
    abs=""
    for c in s:
        if c.isupper():
            abs=abs+c
    return abs
print(shorten("A minha amiga Joana é chata"))