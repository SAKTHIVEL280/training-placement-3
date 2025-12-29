# gcd.py
a=int(input("Enter num 1: "))
b=int(input("Enter num 2: "))
def gcd(x,y):
    while y:
        x,y=y,x%y
    return x
print(f"GCD: {gcd(a,b)}")
