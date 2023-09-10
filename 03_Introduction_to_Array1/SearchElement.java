import java.util.*;
public class SearchElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < arr.length;j++) {
                arr[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(searchElement(arr, k));
            T--;
        }
    }
    public static int searchElement(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return 0;
    }
}


