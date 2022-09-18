import java.util.Scanner;

public class TaxCounter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your income: ");
    double taxableIncome = scan.nextDouble();

    System.out.print("Are you married(true / false): ");
    boolean isMarried = scan.nextBoolean();

    scan.close();

    Tax taxCount = new Tax(isMarried, taxableIncome);

    System.out.printf("your taxes are %.3f", taxCount.getTaxAmount());
  }
}
