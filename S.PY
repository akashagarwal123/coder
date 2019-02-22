n = input()
c=0
for i in n:
    if(i=="!" or i=="@" or i=="#" or i=="$" or i=="&" or i=="." or i=="_" or i=="-"):
        c+=1
print(c)