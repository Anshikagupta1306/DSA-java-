import java.util.*;
public class Sinkcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges[][]= new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                edges[i][j]=sc.nextInt();
            }
        }
        int outdegree[]=new int[n+1];
        for(int edge[]:edges){
            outdegree[edge[0]]++;
        }
        int Sinkcount=0;
        for(int i=1;i<=n;i++){
           if(outdegree[i] == 0){
            Sinkcount++;
           }
        }
        System.out.println(Sinkcount);
    }
}
