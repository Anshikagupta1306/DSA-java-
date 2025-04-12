import java.util.*;
public class BacktrackingArrays {
    public static void ChangeArr(int arr[],int idx,int val){
          if(idx==arr.length){
            printArr(arr);
            return;
          }
          arr[idx]=val;
          ChangeArr(arr, idx+1, val+1);
          arr[idx]=arr[idx]-2;
    } 
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        ChangeArr(arr, 0, 1);
        printArr(arr);
    }
}
