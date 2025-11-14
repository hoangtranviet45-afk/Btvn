import java.util.Scanner;

public class Sort2D {

  public static int[][] input2DArray(int rows, int cols, Scanner sc) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        arr[i][j] = sc.nextInt();
    return arr;
  }

  public static void print2DArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  }

  public static void selectionSortRow(int[] row) {
    for (int i = 0; i < row.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < row.length; j++)
        if (row[j] < row[minIndex]) minIndex = j;
      int temp = row[minIndex];
      row[minIndex] = row[i];
      row[i] = temp;
    }
  }

  public static void insertionSortRow(int[] row) {
    for (int i = 1; i < row.length; i++) {
      int key = row[i], j = i - 1;
      while (j >= 0 && row[j] > key) row[j + 1] = row[j--];
      row[j + 1] = key;
    }
  }

  public static void bubbleSortRow(int[] row) {
    for (int i = 0; i < row.length - 1; i++)
      for (int j = 0; j < row.length - i - 1; j++)
        if (row[j] > row[j + 1]) {
          int temp = row[j];
          row[j] = row[j + 1];
          row[j + 1] = temp;
        }
  }

  public static void sortRows(int[][] arr, String method) {
    for (int[] row : arr) {
      switch (method) {
        case "selection": selectionSortRow(row); break;
        case "insertion": insertionSortRow(row); break;
        case "bubble": bubbleSortRow(row); break;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] originalArray = input2DArray(rows, cols, sc);

    System.out.println("Original array:");
    print2DArray(originalArray);

    int[][] selectionArray = new int[rows][cols];
    int[][] insertionArray = new int[rows][cols];
    int[][] bubbleArray = new int[rows][cols];

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++) {
        selectionArray[i][j] = originalArray[i][j];
        insertionArray[i][j] = originalArray[i][j];
        bubbleArray[i][j] = originalArray[i][j];
      }

    sortRows(selectionArray, "selection");
    System.out.println("After Selection Sort:");
    print2DArray(selectionArray);
    sortRows(insertionArray, "insertion");
    System.out.println("After Insertion Sort:");
    print2DArray(insertionArray);
    sortRows(bubbleArray, "bubble");
    System.out.println("After Bubble Sort:");
    print2DArray(bubbleArray);
    sc.close();
  }
}