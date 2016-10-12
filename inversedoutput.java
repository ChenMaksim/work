import java.util.Scanner;

class InversedOutput {
  public static void main (String[] args) {
    System.out.print(" Vvedite nomer masiva ");
    Scanner scanner = new Scanner(System.in);
    byte a = scanner.nextByte();
    int[] mas = new int[a];
    System.out.println(" Vvedite element masiva ");
    for (int i = 0; i < a; i++) {
      mas[i] = scanner.nextInt();
    }
    System.out.println(" Perevernutiu masiv ");
    for (int i = a - 1; i >= 0; i--) {
      System.out.printf("A[%d] = %d", i, mas[i]);
    }
    int[] mas2 = new int[a];
    System.out.println(" Perevernutiu masiv in the memory: ");
    for (int i = 0; i < a; i++) {
      mas2[i] = mas[a - i - 1];
      System.out.printf("A[%d] = %d", i, mas2[i]);
    }
  }
}
