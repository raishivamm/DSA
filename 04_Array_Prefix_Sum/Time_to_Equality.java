import java.util.*;
public class Time_to_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int time = timetoEqual(arr);
        System.out.println(time);
    }
    public static int timetoEqual(int[] arr){
        int count=0;
        int temp=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){

            if(arr[i]==max){
                continue;
            }
            else{
                temp=max-arr[i];
                count+=temp;
                arr[i]+=temp;
            }
        }
        return count;

    }
}
