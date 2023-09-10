import java.util.*;
public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray();
        int k = sc.nextInt();
        rotateArray(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void rotateArray(int[] arr, int k) {
////        int i = 1;
////        while(i<=k){
////            int temp= arr[arr.length-1];
////            for(int j= arr.length-1;j>0;j--){
////                arr[j] = arr[j-1];
////            }
////            arr[0]=temp;
////            i++;
//    }
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
    }
    public static void reverseArray(int[] arr,int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
