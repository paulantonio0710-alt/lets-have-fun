sum = 0.0
valid_count= 0
count = 1
while count <= 10:
    number = int(input('Enter a number between 0 and 100: '))
    if 0 >= number or number >= 100:
        print('Invalid number. Enter a number between 0 and 100!')
        continue
    else:
        sum += number
        count += 1
print(f'Sum of VALID numbers entered is {sum}.')
