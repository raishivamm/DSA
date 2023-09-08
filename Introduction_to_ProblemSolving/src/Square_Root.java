import java.util.*;
public class Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(squareRoot(num));
    }
    public static int squareRoot(int n){
//        for(int i = 1;i<=n;i++){
//            if(i*i==n){
//                return i;
//            }
//        }
//        return -1;
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end=mid-1;
            }
            if(mid*mid<n){
                start=mid+1;
            }
        }
        return -1;
    }
}
