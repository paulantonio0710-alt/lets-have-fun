import java.util.Scanner;
public class TaskOne{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers(press enter after each number):");
    double sum = 0;
    for(int count = 1; count <= 10; count++) {
      double number = input.nextDouble();
      sum += number;
    }
    System.out.printf("Sum of numbers is %.2f%n", sum);
  }
}
