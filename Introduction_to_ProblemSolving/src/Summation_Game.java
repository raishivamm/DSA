import java.util.*;
public class Summation_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int n){
        return n*(n+1)/2;
    }
}
