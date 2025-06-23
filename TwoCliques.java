import java.util.*;
public class TwoCliques {
   public static boolean isbipartite(int graph[][],int v){
     int color[] = new int[v];
     Arrays.fill(color,-1);
     Queue<Integer> q = new LinkedList<>();
     for(int i=0;i<v;i++){
        if(color[i]==-1){
            q.add(i);
            color[i]=0;
            while(!q.isEmpty()){
                int curr= q.remove();
                for(int j=0;j<v;j++){
                    if(graph[curr][j]==1){
                        if(color[j]==-1){
                            color[j]=1-color[curr];
                            q.add(j);
                        }
                        else if(color[j]==color[curr]){
                            return false;
                        }
                    }
                }
            }
        }
     }
     return true;
   }
   public static boolean canbedivided(int graph[][],int v){
    int complement[][] = new int[v][v];
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            if(i!=j){
                complement[i][j]=(graph[i][j]==1)?0:1;
            }
        }
    }
    return isbipartite(complement, v);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int graph[][]=new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        if(canbedivided(graph, v)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}