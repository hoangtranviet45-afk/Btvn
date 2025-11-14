import java.util.Scanner;
public class Bai3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap n: ");
    int n = sc.nextInt();
    int count = 0, sum = 0, t = n;
    while (t > 0) {
      sum += t % 10;
      t /= 10;
      count++;
    }
    System.out.println("So luong chu so: " + count);
    System.out.println("Tong cac chu so: " + sum);
  }
}