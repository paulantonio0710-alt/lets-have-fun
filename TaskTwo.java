import java.util.Scanner;
public class TaskTwo{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers(press enter after each number):");
    double sum = 0;
    int count = 1;
    for(; count <= 10; count++) {
      double number = input.nextDouble();
      sum += number;
    }
    double average = sum / (count - 1);
    System.out.printf("Average of numbers is %.2f%n", average);
    
  }
}
