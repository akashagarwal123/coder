n=int(input())
sum=0
while(n>0):
    rev=n%10
    sum+=1
    n=n//10
print(sum)