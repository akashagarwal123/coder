n,k=map(int,input().split())
l=list(map(int,input().split()))
flag=0
for i in range(0,len(l)):
    for j in range(i+1,len(l)):
        if(l[i]+l[j]==k):
            flag=1
            break
if(flag==1):
    print("yes")
else:
    print("no")