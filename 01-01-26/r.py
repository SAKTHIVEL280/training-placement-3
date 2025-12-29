# missing_num.py
n=int(input("Enter array size: "))
arr=[int(input()) for i in range(n)]
es=n*(n+1)//2
as_=sum(arr)
print(f"Missing number: {es-as_}")
