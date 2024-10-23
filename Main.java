import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double x;
    double y;
    double z;

    x = sc.nextInt();
    y = sc.nextInt();

    if (x == 1) {
      x = 4;
      z = y * x;
      System.out.printf("Total: R$ %.02f%n", z);

    } else if (x == 2) {
      x = 4.5;
      z = y * x;
      System.out.printf("Total: R$ %.02f%n", z);

    } else if (x == 3) {
      x = 5;
      z = y * x;
      System.out.printf("Total: R$ %.02f%n", z);

    } else if (x == 4) {
      x = 2;
      z = y * x;
      System.out.printf("Total: R$ %.02f%n", z);

    } else if (x == 5) {
      x = 1.5;
      z = y * x;
      System.out.printf("Total: R$ %.02f%n", z);
    }

    sc.close();

  }
}
