import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Converter converter = new Converter();

    System.out.print("Convert from (fl.oz, gal, oz, lb, in, ft, mi): ");
    converter.setConvert_from(scan.next());
    System.out.print("Convert to (ml, l, g, kg, mm, cm, m, km): ");
    converter.setConvert_to(scan.next());
    ;
    System.out.print("Enter value: ");
    converter.setValue(scan.nextDouble());

    scan.close();

    converter.convert();
    System.out.printf("%.4f %s = %.4f %s", converter.getValue(), converter.getConvert_from(),
        converter.getConvertedValue(), converter.getConvert_to());
  }
}
