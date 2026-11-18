sum = 0.0
for count in range(1, 11):
    number = int(input('Enter a number: '))
    if count % 2 == 0:
        sum += number
print(f'Sum of the numbers in even indexes are {sum}')
