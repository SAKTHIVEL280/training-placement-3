s=input("Enter string: ")
st=[]
for c in s:
    if c in '({[':
        st.append(c)
    else:
        if not st:
            print("Not valid")
            exit()
        t=st.pop()
        if c==')'and t!='(':
            print("Not valid")
            exit()
        if c=='}'and t!='{':
            print("Not valid")
            exit()
        if c==']'and t!='[':
            print("Not valid")
            exit()
if not st:
    print("Valid")
else:
    print("Not valid")
