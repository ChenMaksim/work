import java.util.Scanner;

class PrimeComposite {
  public static void main (String[] args) {
    System.out.print(" Vvedite masiv ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] mas = new int[a];
    for (int i = 0; i < a; i++) {
      System.out.printf("A[%d] = ", i);
      mas[i] = sc.nextInt();
    }
    System.out.print(" Result ");
    for (int i = 0; i < a - 1; i++) {
      boolean prost = true;
      if (!(mas[i] > 0 && mas[i] < 4)) {
        for (int j = 2; j * j <= mas[i]; j++) {
          if (mas[i] % j == 0) {
            prost = false;
          }
        }
      } else {
        prost = true;
      }
      if (prost) {
        if (!(mas[i + 1] > 0 && mas[i + 1] < 4)) {
          for (int j = 2; j * j <= mas[i + 1]; j++) {
            if (mas[i + 1] % j == 0) {
              System.out.print(mas[i] + " ");
              break;
            }
          }
        }
      }
    }
  }
}
