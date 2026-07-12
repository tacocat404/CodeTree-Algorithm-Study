A = list(map(int,input().split()))
B = []
for i in A:
    if i == 0:
        break
    B.append(i)

print(*B[::-1])
