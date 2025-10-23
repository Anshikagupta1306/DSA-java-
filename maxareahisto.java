import java.util.*;
public class maxareahisto{
    public static void maxarea(int arr[]){
      int maxarea=0;
      int nsr[] = new int[arr.length];
      int nsl[] = new int[arr.length];
      Stack<Integer> S = new Stack<>();
      for(int i = arr.length-1;i>=0;i--){
        while(!S.isEmpty() && arr[S.peek()]>=arr[i]){
            S.pop();
        }
        if(S.isEmpty()){
            nsr[i]=arr.length;
        }
        else{
            nsr[i]=S.peek();
        }
        S.push(i);
    }
      for(int i=0;i<arr.length;i++){
        while (!S.isEmpty() && arr[S.peek()]>=arr[i]) {
            S.pop();
        }
        if(S.isEmpty()){
            nsl[i]=-1;
      }
      else{
        nsl[i]=S.peek();
      }
      S.push(i);
    }
    for(int i=0;i<arr.length;i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int currArea=height*width;
        maxarea=Math.max(maxarea, currArea);
    }
    System.out.println(maxarea);
}

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxarea(arr);
    }
}