n=int(input())
l=list(map(int,input().strip().split()))
sum=0
for i in l:
    sum+=i
avg=sum//n
print(avg)