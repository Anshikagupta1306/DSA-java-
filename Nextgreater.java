import java.util.*;
public class Nextgreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack <Integer> s = new Stack<>();
        int Nextgreater[] = new int[arr.length];

        for(int i = arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                Nextgreater[i]=-1;
            }
            else{
                Nextgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<Nextgreater.length;i++){
            System.out.print(Nextgreater[i]+" , ");
        }
        System.out.println();
    }
}
