import java.util.Scanner;
public class Bai8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap n: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i += 2) sum += i;
    System.out.println("Tong so le = " + sum);
  }
}