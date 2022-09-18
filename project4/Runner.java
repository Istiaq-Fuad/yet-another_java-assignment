import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scan.nextInt();

    scan.close();
    RomanConv romanConv = new RomanConv(number);
    romanConv.calculateRoman();

    System.out.println("the roman number is " + romanConv.getRoman());
  }
}
