import  java.util.Scanner;

class Transporting {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Vvedite chisla ");
    int a = sc.nextInt();
    System.out.print(" Vvedite chisla ");
    int b = sc.nextInt();
    int[][] mas = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas[i][j] = sc.nextInt();
      }
    }
    System.out.println("Your masiv ");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(" Result ");
    for (int j = 0; j < b; j++) {
      for (int i = 0; i < a; i++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
