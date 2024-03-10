X=int(input("Qual o número de segundos?"))
h= X // 3600
m= (X - (h*3600))//60
s=X - (h*3600)-(m*60)
print("{:02d}:{:02d}:{:02d}".format(h,m,s))
