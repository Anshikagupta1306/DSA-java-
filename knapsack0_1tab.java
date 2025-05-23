import java.util.*;
public class knapsack0_1tab {
    public static int knapsack(int val[],int wt[],int w){
        int n=val.length;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int v=val[i-1];
                int W=wt[i-1];
                if(W<=j){
                    int ans1=v+dp[i-1][j-W];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1, ans2);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        System.out.println(knapsack(val, wt, w));
    }
}
