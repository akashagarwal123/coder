a=input()
b=input()
e=a.replace(" ","")
f=b.replace(" ","")
g=int(e)
h=int(f)
m=0
n=0
if(g>h):
    m=(g-h)
    p=str(m)
    print(p[0],end=" ")
    for i in range(1,len(p)):
        print(p[i],end="")
else:
    n=(h-g)
    p=str(n)
    print(p[0],end=" ")
    for i in range(1,len(p)):
        print(p[i],end="")