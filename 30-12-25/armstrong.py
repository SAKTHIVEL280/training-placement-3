n=int(input("Enter number: "))
o=n
c=len(str(n))
s=sum(int(d)**c for d in str(n))
if s==o:
    print(f"{o} is armstrong")
else:
    print(f"{o} is not armstrong")
