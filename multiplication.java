import java.util.Scanner;

class Multiplication {
  public static void main (String[] args) {
    System.out.print(" Vvedite first masiv ");
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    System.out.print(" Vvedite first masiv ");
    int b1 = sc.nextInt();
    int[][] mas1 = new int[a1][b1];
    for (int i = 0; i < a1; i++) {
      for (int j = 0; j < b1; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas1[i][j] = sc.nextInt();
      }
    }
    int a2 = b1;
    System.out.print(" Vvedite second masiv ");
    int b2 = sc.nextInt();
    int[][] mas2 = new int[a2][b2];
    for (int i = 0; i < a2; i++) {
      for (int j = 0; j < b2; j++) {
        System.out.printf("B[%d][%d] = ", i, j);
        mas2[i][j] = sc.nextInt();
      }
    }
    System.out.println(" Your first masiv  ");
    for (int i = 0; i < a1; i++) {
      for (int j = 0; j < b1; j++) {
        System.out.print(mas1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(" Your second masiv ");
    for (int i = 0; i < a2; i++) {
      for (int j = 0; j < b2; j++) {
        System.out.print(mas2[i][j] + " ");
      }
      System.out.println();
    }
    int[][] masres = new int[a1][b2];
    for (int i = 0; i < a1; i++) {
      for (int k = 0; k < b2; k++) {
        for (int j = 0; j < b1; j++) {
          int itog = 0;
          itog = mas1[i][j] * mas2[j][k];
          masres[i][k] += itog;
        }
      }
    }
    System.out.println(" Done! Result ");
    for (int i = 0; i < a1; i++) {
      for (int j = 0; j < b2; j++) {
        System.out.print(masres[i][j] + " ");
      }
      System.out.println();
    }
  }
}
