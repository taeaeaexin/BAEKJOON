sum = 0
record = 'P'

for _ in range(5):
    n = int(input())
    if n < 40:
        record = 'F'
    sum += n

if sum < 60:
    record = 'F'

print(record)