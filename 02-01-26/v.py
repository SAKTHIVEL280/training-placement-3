# max_subarr.py
n=int(input("Enter array size: "))
arr=[int(input()) for i in range(n)]
ms=arr[0]
cs=arr[0]
for i in range(1,n):
    cs=max(arr[i],cs+arr[i])
    ms=max(ms,cs)
print(f"Max subarray sum: {ms}")
