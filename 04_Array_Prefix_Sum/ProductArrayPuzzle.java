import java.util.*;
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] pref = prefixArray(arr);
        int[] suff = suffixArray(arr);
        System.out.println(Arrays.toString(pref));
        System.out.println(Arrays.toString(suff));

    }
    public static int[] prefixArray(int[] arr){
        int[] prefArray = new int[arr.length];
        prefArray[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefArray[i] = prefArray[i-1] * arr[i];
        }
        return prefArray;
    }
    public static int[] suffixArray(int[] arr){
        int n = arr.length;
        int[] suffArray = new int[arr.length];
        suffArray[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffArray[i] = suffArray[i+1] * arr[i];
        }
        return suffArray;
    }
}
