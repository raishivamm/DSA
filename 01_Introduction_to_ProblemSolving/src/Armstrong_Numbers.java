import java.util.*;
public class Armstrong_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
    }
    public static boolean isArmstrong(int n){
        int count = 0;
        int temp =n;
        while(n!=0){
            count++;
            n/=10;
        }
        if(count<3){
            return false;
        }
        n=temp;
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum = sum+(int)Math.pow(rem,count);
            n/=10;
        }
        return temp == sum;
    }
}
