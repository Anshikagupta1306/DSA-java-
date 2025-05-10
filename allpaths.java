import java.util.*;
public class allpaths {
     static class edge{
        int src,des;
        public edge(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void printallpaths(ArrayList<edge>graph[],int src,int des,String path){
        if(src==des){
            System.out.println(path+des);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            edge e=graph[src].get(i);
            printallpaths(graph, e.des, des, path+src);
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
            int d=sc.nextInt();
            graph[s].add(new edge(s,d));
        }
        System.out.println("enter source and destination:");
        int src=sc.nextInt();
        int des=sc.nextInt();
        printallpaths(graph, src, des, "");
        sc.close();
    }
}
