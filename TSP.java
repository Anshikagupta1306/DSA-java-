import java.util.Scanner;

public class TSP {
   public static int TSPcost(int cost[][]){
        int n=cost.length;
        boolean visited[]=new boolean[n];
        visited[0]=true;
        return TSPhelper(cost,visited,0,n,1,0,0);
   }    
   public static int TSPhelper(int cost[][],boolean visited[],int currpos,int n,int count,int totalcost,int start){
         if(count == n && cost[currpos][start]>0){
            return totalcost + cost[currpos][start];
         }
         int ans=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            if(!visited[i] && cost[currpos][i]>0){
                visited[i]=true;
               int temp = TSPhelper(cost, visited, i, n , count+1, totalcost+cost[currpos][i], start);
               ans=Math.min(ans, temp);
               visited[i]=false;
            }
         }
         return ans;
   }
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int cost[][]=new int[n][n];
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            cost[i][j]=sc.nextInt();
         }
      }
      System.out.println(TSPcost(cost));
   }
}
