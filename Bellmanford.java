import java.util.*;
public class Bellmanford {
    static class edge{
        int src,wt,des;
        public edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
    public static void bellman(ArrayList<edge>graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        int v=graph.length;
        for(int i=0;i<v-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    edge e=graph[j].get(k);
                    int u=e.src;
                    int ve=e.des;
                    int we=e.wt;
                   if(dist[u]!=Integer.MAX_VALUE && dist[u]+we<dist[ve]){
                    dist[ve]=dist[u]+we;
                   }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of vertices");
        int v=sc.nextInt();
        ArrayList<edge> []graph =new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        System.out.println("Enter number of edges:");
        int ed = sc.nextInt();
        for(int i=0;i<ed;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
             int w=sc.nextInt();
            graph[s].add(new edge(s, d,w));
        }
        bellman(graph,0);
        sc.close();
    }
}
