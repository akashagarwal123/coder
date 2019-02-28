n=input()
c=0
for i in n:
    if(i=="1" or i=="0"):
        c+=1
if(c==len(n)):
    print("yes")
else:
    print("no")