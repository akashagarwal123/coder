n=input()
s=[]
for i in n:
    s.append(i)
flag=0
dlag=0
for i in range(0,len(s)):
    c=ord(s[i])
    if((c>=65 and c<=91) or (c>=97 or c<=122)):
        flag=1
        break
for i in range(0,len(s)):
    c=ord(s[i])
    if(c>=48 and c<=57):
        dlag=1
        break
if(flag==dlag):
    print("Yes")
else:
    print("No")
                
