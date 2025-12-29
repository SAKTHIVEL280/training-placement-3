# single_num.py
n=int(input("Enter array size: "))
arr=[int(input()) for i in range(n)]
r=0
for x in arr:
    r^=x
print(f"Single number: {r}")
