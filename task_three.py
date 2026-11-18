sum = 0.0
for count in range(10):
    number = int(input('Enter number: '))
    sum += number
average = sum/(count+1)
print(f'Sum of total numbers entered is {sum}')
print(f'Average of total numbers entered is {average}')
