sum = 0.0
even_count = 0
for count in range(1, 11):
    number = int(input('Enter a number: '))
    if number % 2 == 0:
        sum += number
        even_count += 1
average = sum / even_count
print(f'Sum of even numbers in your inputs is {sum}')
print(f'Average of even numbers in your inputs is {average}')
