import java.util.*;
public class Kahns {
   static class edge{
        int src,des;
        public edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void calcindeg(ArrayList<edge> graph[],int[] indeg){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                edge e=graph[v].get(j);
                indeg[e.des]++;
            }
        }
    }
    public static void sort(ArrayList<edge>graph[]){
        int indeg[]=new int[graph.length];
        calcindeg(graph, indeg);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                edge e=graph[curr].get(i);
                indeg[e.des]--;
                if(indeg[e.des]==0){
                    q.add(e.des);
                }
            }
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
            graph[s].add(new edge(s,d));
        }
        sort(graph);
        sc.close();
    }    
}
