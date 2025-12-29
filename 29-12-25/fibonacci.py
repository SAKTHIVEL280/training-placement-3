n=int(input("Enter number: "))
a,b=0,1
print(f"Fibonacci: {a} {b}",end=" ")
for i in range(2,n):
    c=a+b
    print(c,end=" ")
    a,b=b,c
