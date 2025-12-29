s1=input("Enter string 1: ")
s2=input("Enter string 2: ")
if len(s1)!=len(s2):
    print("Not anagram")
else:
    if sorted(s1)==sorted(s2):
        print("Anagram")
    else:
        print("Not anagram")
