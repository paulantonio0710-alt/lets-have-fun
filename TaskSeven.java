import java.util.Scanner;
public class TaskSeven{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers(press enter after each number:)");
    double sum = 0;
    int evenCount = 0;
    for(int count = 1; count <= 10; count++) {
      double number = input.nextDouble();
      if(number % 2 == 0) {
        sum += number;
        evenCount += 1;
      }
    }
    double average = sum / evenCount;
    System.out.printf("The sum of the even numbers in the numbers you input is %.2f.%nTheir average is %.2f.%n", sum, average);
  }
}
