import java.util.*;
public class Is_It_Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=1;
        while(k<=t){
            int N = sc.nextInt();
            int sumDivisors=0;
            for(int i=1;i<=N/2;i++){
                if(N%i==0){
                    sumDivisors+=i;
                }
            }
            if(N==sumDivisors){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            k++;

        }
    }
}
