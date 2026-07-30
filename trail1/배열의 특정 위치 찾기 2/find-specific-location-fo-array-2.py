cnt = 1
odd = 0
even = 0

nbs = list(map(int,input().split()))
for e in nbs:
    if cnt % 2 == 1:
        odd += e
    else:
        even += e
    cnt += 1

print(abs(odd - even))
    