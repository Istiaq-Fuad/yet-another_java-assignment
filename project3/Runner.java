import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter a year after 1582: ");
    int inputYear = scan.nextInt();

    scan.close();

    if (inputYear < 1582) {
      System.out.println("can't be counted");
      return;
    }

    LeapYear leapYear = new LeapYear(inputYear);
    if (leapYear.isLeapYear())
      System.out.println("the year is leap year");
    else
      System.out.println("the year is not leap year");
  }
}
