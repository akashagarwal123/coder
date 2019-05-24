n= map(int,input().split())
l=list(map(int,input().split()))
l.sort(reverse=True)
for i in l:
    print(i)