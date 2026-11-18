import java.util.Scanner;
public class TaskTen {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 numbers between 0 and 100(press enter after each number:)");
    double sum = 0;
    int validCount = 0;
    for(int count = 1; count <= 10; count++){
      double number = input.nextDouble();
      if(number > 0 && number < 100) {
        sum += number;
        validCount += 1;
      }
      else {
       continue;
      }
    }
    double average = sum / validCount;
    System.out.printf("The average of the VALID numbers you input is %.2f.%n", average);
  }
}
