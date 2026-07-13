L = list(map(int,input().split()))
FL = []
for i in L:
    if i == 0:
        break
    else:
        FL.append(i)

print(FL[-1] + FL[-2] + FL[-3])