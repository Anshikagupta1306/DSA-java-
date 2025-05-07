import java.util.*;
public class Haspath {
    static class edge{
        int src,wt,des;
        public edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static boolean haspath(ArrayList<edge>graph[],int src,int des,boolean vis[]){
        if(src==des){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            edge e=graph[src].get(i);
            if(!vis[e.des]&&haspath(graph, e.des, des, vis)){
                return true;
            }
        }
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
        System.out.println("enter src:");
        int s=sc.nextInt();
        System.out.println("enter destination:");
        int d=sc.nextInt();
        System.out.println(haspath(graph, s, d, new boolean[v]));
        sc.close();
    }
}
