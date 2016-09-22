public class poradok{
  public static void main(String[] args){
    int a[]={-3,-7,10,11,-5,2};
  for (int i=0; i < a.length; i++){
    int min=a[i];
        int min_i=i;
        for (int j=i+1; j < a.length; j++){
          if (a[j] < min){
            min=a[j];
                min_i=j;
          }
        }
          if (i !=min_i) {
            int tmp=a[i];
              a[i]=a[min_i];
              a[min_i]=tmp;
}
          System.out.println(a[i]+"");
  }
  }
}
