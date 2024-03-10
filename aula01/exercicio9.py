t1 = 10 * 1
t2 = 6 * 3
t3 = 4 * 10
tempo = ((6 * 60) + 52) + t1 + t2 + t3
horas = tempo // 60
minutos = ((tempo / 60) - horas) * 60
print(horas,minutos)
