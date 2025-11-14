import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap thang: ");
    int t = sc.nextInt();
    System.out.print("Nhap nam: ");
    int y = sc.nextInt();
    int days = switch (t) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      case 2 -> (isLeap(y) ? 29 : 28);
      default -> -1;
    };
    if (days == -1)
      System.out.println("Thang khong hop le!");
    else
      System.out.println("Thang " + t + " nam " + y + " co " + days + " ngay");
  }
  static boolean isLeap(int y) {
    return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
  }
}