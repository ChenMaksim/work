import java.util.Scanner;
 public class udalenie{
  public static void main(String[]args){
     int a[]={-3,-7,10,11,2};
      Scanner scan = new Scanner(System.in);
       int b = scan.nextInt();
       for(int i=b;i < a.length-1;i++){
        a[i]=a[i+1];}
         for(int i=0;i<a.length - 1;i++){
           System.out.println(a[i]+" ");
    }
  }
}
