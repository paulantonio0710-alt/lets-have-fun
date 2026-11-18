sum = 0.0
for count in range(10):
    number = int(input('Enter a number: '))
    if number % 2 == 0:
        sum += number
print(f'Sum of even numbers in your inputs is {sum}')
