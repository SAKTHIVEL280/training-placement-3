n=int(input("Enter number: "))
fl=True
if n<=1:
    fl=False
for i in range(2,int(n**0.5)+1):
    if n%i==0:
        fl=False
        break
if fl:
    print(f"{n} is prime")
else:
    print(f"{n} is not prime")
