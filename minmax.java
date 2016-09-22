public class minmax {
    public static void main(String[] args){
        int [] a = {23, 11, 150, 7};
        int max = a[0];
        int min = a[0];
        for(int i = 0; i != a.length; i ++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
