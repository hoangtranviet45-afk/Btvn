import java.util.Scanner;
public class Bai9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap n: ");
    int n = sc.nextInt();
    int a = n / 100;
    int b = (n / 10) % 10;
    int c = n % 10;
    int sum = a * a * a + b * b * b + c * c * c;
    if (sum == n) System.out.println("So Armstrong");
    else System.out.println("Khong phai Armstrong");
  }
}