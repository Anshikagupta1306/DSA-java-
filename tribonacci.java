import java.util.*;
public class tribonacci {
    public static void tb(int n){
        int dp[]=new int [n+1];
       dp[0]=dp[1]=0;
       dp[2]=1;
       for(int i=3;i<n+1;i++){
        dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
       }
       for(int i=0;i<n;i++){
        System.out.print(dp[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        tb(n);
        sc.close();
    }
}
