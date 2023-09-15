import java.util.*;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefSum = prefixArray(arr);
        int ans = checkEqui(prefSum);
        System.out.println(ans);
    }
    public static int checkEqui(int[] prefSum){
        for(int i=0;i<prefSum.length;i++){
            if(isEqui(prefSum,i)){
                return i;
            }
        }
        return -1;
    }
    public static boolean isEqui(int[] arr,int k){
        int leftSum=0;
        int rightSum=0;
        if(k==0){
            leftSum = 0;
        }
        else{
            leftSum = arr[k-1];
        }
        rightSum = arr[arr.length-1]-arr[k];
        return leftSum==rightSum;
    }
    public static int[] prefixArray(int[] num){
        int[] prefSum = new int[num.length];
        prefSum[0] = num[0];
        for(int i=1;i<num.length;i++){
            prefSum[i] = num[i] + prefSum[i-1];
        }
        return prefSum;
    }
}
