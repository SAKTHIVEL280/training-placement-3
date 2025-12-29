# move_zero.py
n=int(input("Enter array size: "))
arr=[int(input()) for i in range(n)]
p=0
for i in range(n):
    if arr[i]!=0:
        arr[p]=arr[i]
        p+=1
while p<n:
    arr[p]=0
    p+=1
print("After moving zeroes:",arr)
