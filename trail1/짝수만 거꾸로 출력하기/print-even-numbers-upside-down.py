N = int(input())
L = list(map(int,input().split()))
L = list(filter(lambda x:x % 2 == 0,L))
print(*L[::-1])

    