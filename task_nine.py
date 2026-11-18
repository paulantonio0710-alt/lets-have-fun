sum = 0.0
for count in range(10):
    number = int(input('Enter a number between 0 and 100: '))
    if 0 < number < 100:
        sum += number
    else:
        continue
print(f'Sum of VALID numbers entered is {sum}.')
