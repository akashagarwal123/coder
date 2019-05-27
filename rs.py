str=input()
l=list(str.split(" "))
p=[]
for i in l:
    p.append(i[::-1])
print(*p)