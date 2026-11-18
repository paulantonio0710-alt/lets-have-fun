import java.util.Scanner;
public class TaskEight{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers between 0 and 100(press enter after each number:)");
    double sum = 0;
    for(int count = 1; count <= 10; count++){
      double number = input.nextDouble();
      if(number > 0 && number < 100) {
        sum += number;
      }
      else {
        System.out.println("Invalid Number. Enter a number between 0 and 100.");
        count--;
      }
    }
    System.out.printf("The sum of the numbers you input is %.2f.%n", sum);
  }
}
