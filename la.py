k=int(input())
p=[]
for i in range(0,k):
    l=list(map(int,input().split()))
    for j in range(0,len(l)):
        p.append(l[j])
p.sort()
print(*p)
    