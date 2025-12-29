n=int(input("Enter array size: "))
arr=[int(input()) for i in range(n)]
s=set()
for x in arr:
    if x in s:
        print("Contains duplicate")
        exit()
    s.add(x)
print("No duplicate")
