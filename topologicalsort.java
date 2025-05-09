import java.util.*;
public class topologicalsort {
    static class edge{
        int src,des;
        public edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void topsort(ArrayList<edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topsortutil(graph,i,vis,s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void topsortutil(ArrayList<edge> graph[],int curr,boolean vis[],Stack<Integer>s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.des]){
                topsortutil(graph, e.des, vis, s);
            }
        }
        s.push(curr);
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
        topsort(graph);
        sc.close();
    }
}
