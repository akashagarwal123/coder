N,k=map(int,input().split())
n=list(map(int,input().strip().split()))
c=0
for i in range(0,N):
    if(k==n[i]):
        c+=1
print(c)
