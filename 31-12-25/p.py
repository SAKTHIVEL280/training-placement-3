a=int(input("Enter num 1: "))
b=int(input("Enter num 2: "))
def gcd(x,y):
    while y:
        x,y=y,x%y
    return x
l=(a*b)//gcd(a,b)
print(f"LCM: {l}")
