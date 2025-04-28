import java.util.*;
public class UserGraphAl {
    static class edge{
        int src,wt,des;
        public edge(int src,int wt,int des){
            this.src=src;
            this.wt=wt;
            this.des=des;
        }
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
            int w=sc.nextInt();
            int d=sc.nextInt();
            graph[s].add(new edge(s, w, d));
        }
        System.out.println("enter node whose neighbours is to be printed:");
        int n=sc.nextInt();
        for(int i=0;i<graph[n].size();i++){
            edge e=graph[n].get(i);
            System.out.println("destination:"+e.des+" weight:"+e.wt+"Source:"+e.src);
        }
        sc.close();
    }
}
