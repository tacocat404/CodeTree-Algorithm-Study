N = int(input())
P = 0
for _ in range(N):
    A = list(map(int,input().split()))
    B = sum(A) // 4
    if B >= 60:
        print("pass")
        P += 1
    else:
        print("fail")
print(P)