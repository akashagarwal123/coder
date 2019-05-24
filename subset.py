n,m = map(int,input().split())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
if set(b).issubset(set(a)):
    print("YES")
else:
    print("NO")