n=int(input())
l=list(map(int,input().split()))
p=[]
for i in range(0,len(l)):
    for j in range(i+1,len(l)):
        sum=0
        sum+=l[j]+l[i]
        p.append(sum)
s=set(p)
print(max(s))
    