import java.util.Scanner;
public class TaskFour{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers(press enter after each number:");
    int evenCount = 0;
    double sum = 0;
    for(int count = 1; count <= 10; count++) {
      double number = input.nextDouble();
      evenCount += 1;
      if(evenCount % 2 == 0) {
        sum += number;
      }
    }
    System.out.printf("The sum of the even indexed number in the numbers you input is %.2f.%n", sum);
  }
}
