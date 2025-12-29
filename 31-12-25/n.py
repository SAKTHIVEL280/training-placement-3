# vowel_count.py
s=input("Enter string: ")
v="aeiouAEIOU"
c=sum(1 for ch in s if ch in v)
print(f"Vowel count: {c}")
