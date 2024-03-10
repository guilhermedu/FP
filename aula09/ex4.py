"""                   
*O ficheiro wordlist.txt contém uma lista de palavras de língua inglesa, por ordem.
Leia essas palavras para uma lista e, usando uma função de pesquisa binária (do módulo
bisect), descubra quantas palavras começam por “ea”, sem ter de percorrer tudo.
Sugestão: procure a primeira palavra com “ea” e a primeira com “eb” e subtraia os
índices. E quantas palavras começam por “tb”? Nenhuma? Então qual é primeira letra,
maior que ‘b’, que ocorre após um “t”, nas palavras inglesas?
"""

import bisect
from hashlib import sha3_224

def countWords(words, s1,s2):
    first=bisect.bisect_left(words, s1)
    last=bisect.bisect_right(words, s2)
    return last-first

def getNextWord(words, s):
	...

#START
if __name__ == "__main__":
	
	counts = {}
	f = open("wordlist.txt", "r")
	words = [w.strip() for w in f]
	f.close()

	print("Number of Words", countWords(words, 'ea', 'eb'))

	w = getNextWord(words, 'tb')
	print("Next Word", w, "Next Letter", w[1])



	

