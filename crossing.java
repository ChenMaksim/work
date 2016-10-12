import java.util.Scanner;

class Crossing {
  public static void main (String[] args) {
    System.out.print(" Vvedite nomera first masivov ");
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int[] mas1 = new int[a1];
    for (int i = 0; i < a1; i++) {
      System.out.printf("A[%d] = ", i);
      mas1[i] = sc.nextInt();
    }
    System.out.print(" Vvedite nomera second masivov ");
    int a2 = sc.nextInt();
    int[] mas2 = new int[a2];
    for (int i = 0; i < a2; i++) {
      System.out.printf("B[%d] = ", i);
      mas2[i] = sc.nextInt();
    }
    int[] mas = new int[a1];
    int chet = 0;
    for (int i = 0; i < a1; i++) {
      for (int j = 0; j < a2; j++) {
        if (mas1[i] == mas2[j]) {
          mas[chet] = mas1[i];
          chet++;
          for (int m1 = i + 1; m1 < a1; m1++) {
            System.out.println(m1);
            if (mas1[i] == mas1[m1]) {
              mas1[m1] = -999;
            }
          }
          break;
        }
      }
    }
    System.out.print(" Peresechenie ");
    for (int i = 0; i < chet; i++) {
      System.out.printf("%d ", mas[i]);
    }
  }
}
