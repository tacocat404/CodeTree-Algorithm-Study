L = list(map(int,input().split()))
twoL = L[1:][::2]
threeL = L[2:][::3]

print(f"{sum(twoL)} {sum(threeL)/3:.1f}")
