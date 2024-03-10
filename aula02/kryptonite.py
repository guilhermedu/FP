
# This program should find the phase of a fictional substance
# for given temperature and pressure conditions, but it has several bugs!
# 
# a) Try to run the program with Python3 and see what happens.
#    There's a syntax error near the end.  Fix it.
# b) Try again.  It'll crash with a runtime error.  Find the cause and fix it.
# c) There is also a semantic error: for T=300 and P=100,
#    the phase should be SOLID.
#    Fix it to agree with the phase diagram.  Test in several conditions!
# d) Adjust the format string to output the temperature with 1 decimal place
#    and the pressure with 3. 

print("Kryptonite phase classifier")

# Input.  (You can fix the runtime error by changing something here!)
T = float(input("Temperature (K)? "))
P = float(input("Pressure (kPa)? "))

if P > 50.0 and T > 400:
    phase = "LIQUID"
elif T < 400.0 and P/T >= 1/8:
    phase = "SOLID"
else:
    phase = "GAS"

print("À temperatura de", "{:.1f}".format(T), "K e pressão de", "{:.3f}".format(P), " KPaencontra-se na fase", phase)

