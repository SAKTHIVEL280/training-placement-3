# intersect_arr.py
n1=int(input("Enter size of array 1: "))
a1=[int(input()) for i in range(n1)]
n2=int(input("Enter size of array 2: "))
a2=[int(input()) for i in range(n2)]
s1=set(a1)
rs=set(a2)&s1
print("Intersection:",list(rs))
