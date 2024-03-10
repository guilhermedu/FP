import sys
pg3333 = sys.argv[1]

with open(pg3333, "r", encoding="utf-8") as text:
    d = {}
    char = text.read(1)
    while char:
        if char.isalpha():
            char = char.lower()
            d[char] = d.get(char, 0) + 1
        char = text.read(1)

for e in sorted(d, key=lambda e: d[e], reverse=True):
    print(e, d[e])
