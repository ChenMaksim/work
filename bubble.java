import java.util.Scanner;

class Bubble {
  public static void main (String[] args) {
    System.out.print("Vvedite chislo ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] mas = new int[a];
    for (int i = 0; i < a; i++) {
      System.out.printf("A[%d] = ", i);
      mas[i] = sc.nextInt();
    }
    for (int i = 0; i < a - 1; i++) {
      for (int j = i + 1; j < a; j++) {
        if (mas[i] > mas[j]) {
          int buf = mas[j];
          mas[j] = mas[i];
          mas[i] = buf;
        }
      }
    }
    System.out.printf(" Sort down ");
    for (int i = 0; i < a; i++) {
      System.out.print(mas[i] + " ");
    }
    System.out.printf(" Sort up ");
    for (int i = a - 1; i >= 0; i--) {
      System.out.print(mas[i] + " ");
    }
  }
}
