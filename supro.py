n,m = map(int,input().split())
l=list(map(int,input().split()))
for i in range(0,m):
    u,v = map(int,input().split())
    sum=0
    x=u-1
    y=v-1
    for j in range(x,y+1):
        sum+=l[j]
    print(sum)
        