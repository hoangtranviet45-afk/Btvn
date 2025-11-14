import java.util.Scanner;
public class Bai5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap n: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) sum += i;
    }
    if (sum == n) System.out.println("So hoan hao");
    else System.out.println("Khong phai so hoan hao");
  }
}