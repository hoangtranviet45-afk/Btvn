import java.util.Scanner;
public class Bai6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap h: ");
    int h = sc.nextInt();
    System.out.print("Nhap w: ");
    int w = sc.nextInt();
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        if (i == 1 || i == h || j == 1 || j == w)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}