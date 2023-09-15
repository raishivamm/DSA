import java.util.*;
public class prefix_SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefOdd = new int [arr.length];
        int[] prefEven = new int [arr.length];
        prefCalculate(prefOdd,prefEven,arr);
        System.out.println(Arrays.toString(prefOdd));
        System.out.println(Arrays.toString(prefEven));

    }
    public static int checkEqual(int[] prefOdd, int[] prefEven){
        return 0;

    }
    public static void prefCalculate(int[] prefOdd, int[] prefEven,int[] arr){
        prefOdd[0] = 0;
        prefEven[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                prefEven[i] = arr[i] + prefEven[i-1];
                prefOdd[i] = prefOdd[i-1];
            }
            else{
                prefOdd[i] = arr[i] + prefOdd[i-1];
                prefEven[i] = prefEven[i-1];
            }

        }
    }
}
