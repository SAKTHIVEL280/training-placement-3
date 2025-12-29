# palindrome.py
x=int(input("Enter number: "))
if x<0:
    print("Not palindrome")
else:
    o=x
    r=0
    while x!=0:
        d=x%10
        r=r*10+d
        x//=10
    if o==r:
        print(f"{o} is palindrome")
    else:
        print(f"{o} is not palindrome")
