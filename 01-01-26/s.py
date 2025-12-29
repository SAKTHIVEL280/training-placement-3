n=int(input("Enter days: "))
p=[int(input()) for i in range(n)]
mp=p[0]
mx=0
for i in range(1,n):
    if p[i]<mp:
        mp=p[i]
    else:
        mx=max(mx,p[i]-mp)
print(f"Max profit: {mx}")
