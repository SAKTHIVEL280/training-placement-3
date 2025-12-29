# char_freq.py
s=input("Enter string: ")
d={}
for c in s:
    d[c]=d.get(c,0)+1
print("Character frequency:")
for k,v in d.items():
    print(f"{k}: {v}")
