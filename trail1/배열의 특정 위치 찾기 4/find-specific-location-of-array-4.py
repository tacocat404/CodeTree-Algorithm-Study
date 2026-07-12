A = list(map(int,input().split()))
B = []
for i in A:
    if i == 0:
        break
    B.append(i)

B = list(filter(lambda x:x % 2 == 0,B))
print(len(B),sum(B))