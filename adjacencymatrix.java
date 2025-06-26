import java.util.*;
public class adjacencymatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=sc.nextInt();
        int e =sc.nextInt();
        int adjacencymatrix[][]=new int[v][v];
        System.out.println("is graph directed?(1 for yes 0 for no)");
        int d=sc.nextInt();
        for(int i=0;i<e;i++){
            int from=sc.nextInt();
            int to=sc.nextInt();
            adjacencymatrix[from][to]=1;
            if(d==0){
            adjacencymatrix[to][from]=1;
        }
        }
        System.out.println("Adjacency matrix:");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adjacencymatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
