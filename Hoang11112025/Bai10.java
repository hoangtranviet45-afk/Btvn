import java.util.Scanner;
public class Bai10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap a: ");
    int a = sc.nextInt();
    System.out.print("Nhap b: ");
    int b = sc.nextInt();
    int bcnn = (a * b) / gcd(a, b);
    System.out.println("BCNN = " + bcnn);
  }
  static int gcd(int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
}