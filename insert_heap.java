import java.util.*;
public class insert_heap {
    static class heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void ass(int data){
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                //swap
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x=par;
                par=(x-1)/2;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
