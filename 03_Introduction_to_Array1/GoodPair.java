import java.util.*;
public class GoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        System.out.println(goodPair(arr,b));
    }
    public static int goodPair(int[] A, int B){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(i==j){
                    continue;
                }
                if(A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}

