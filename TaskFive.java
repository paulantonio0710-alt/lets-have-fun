import java.util.Scanner;
public class TaskFive{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers(press enter after each number:)");
    double sum = 0;
    for(int count = 1; count <= 10; count++) {
      double number = input.nextDouble();
      if(number % 2 == 0) {
        sum += number;
      }
    }
    System.out.printf("The sum of the even numbers in the numbers you input is %.2f.%n", sum);
  }
}
