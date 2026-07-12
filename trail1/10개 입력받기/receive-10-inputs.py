A = list(map(int,input().split()))
B = []
for i in A:
    if i == 0:
        break
    B.append(i)

print(f"{sum(B)} {sum(B) / len(B):.1f}")