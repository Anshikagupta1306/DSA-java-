import java.util.*;
public class detectcycleDirected {
    static class edge{
        int src,des;
        public edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static boolean iscycle(ArrayList<edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(iscycleutil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean iscycleutil(ArrayList<edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(stack[e.des]){
                return true;
            }
            if(!vis[e.des]&& iscycleutil(graph, e.des, vis, stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
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
        System.out.println(iscycle(graph));
        sc.close();
    }
}
