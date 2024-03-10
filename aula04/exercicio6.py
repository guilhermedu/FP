def leibnizPi4(n):
	i = 0
	pi = 0
	for r in range(n):
		pi = pi + ((-1)**i) / (2*i + 1)
		i += 1
	return pi
	
def main():
	terms = int(input("How many terms to sum? "))
	print("The sum is {}, times 4 is {}".format(leibnizPi4(terms), leibnizPi4(terms)*4))

main()
