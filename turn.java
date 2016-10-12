import java.util.Scanner;

class Turn {
  public static void main (String[] args) {
    System.out.print("Vvedite matricu ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[][] mas = new int[a][a];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas[i][j] = sc.nextInt();
      }
    }
    System.out.println("Your masiv ");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
    int step = 1;
    for (int i = 0; i < a - 1; i++) {
      for (int j = a - i - 2; j >= 0; j--) {
        mas[i][j] = mas[i][j] - mas[i + step][j + step];
        mas[i + step][j + step] = mas[i + step][j + step] + mas[i][j];
        mas[i][j] = mas[i + step][j + step] - mas[i][j];
        step++;
      }
      step = 1;
    }
    System.out.println("Rezultat ");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print(mas[i][j] + " ");
      }
      System.out.println();
    }
  }
}
