n=int(input())
i=2
flag=0
while(i<=(n**0.5)):
    if(n%i==0):
      flag=1
      break
    else:
        flag=0
    i+=1
if(flag==0):
    print("yes")
else:
    print("no")
    