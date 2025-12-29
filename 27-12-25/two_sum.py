n=int(input("Enter array size: "))
arr=[int(input()) for i in range(n)]
t=int(input("Enter target: "))
m={}
for i in range(n):
    c=t-arr[i]
    if c in m:
        print(f"Indices: {m[c]}, {i}")
        break
    m[arr[i]]=i
