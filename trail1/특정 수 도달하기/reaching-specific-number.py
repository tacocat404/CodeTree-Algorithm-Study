N = map(int,input().split())
C = 0
sumx = 0 
for i in N:
    if i >= 250:
        break
    else:
        C += 1
        sumx += i

print(f"{sumx} {sumx / C:.1f}")