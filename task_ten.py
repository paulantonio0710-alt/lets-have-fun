sum = 0.0
even_count = 0
for count in range(10):
    number = int(input('Enter a number between 0 and 100: '))
    if 0 < number < 100:
        sum += number
        even_count += 1
    else:
        continue
average = sum / even_count    
print(f'Average of VALID numbers entered is {average}.')
