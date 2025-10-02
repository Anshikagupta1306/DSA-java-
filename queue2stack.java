import java.util.*;
public class queue2stack {
    static class queue{
        static Stack<Integer> S1 = new Stack<>();
        static Stack<Integer> S2 = new Stack<>();
        
        public static boolean isEmpty(){
            return S1.isEmpty();
        }
        public static void add(int data){
            while(!S1.isEmpty()){
                S2.push(S1.pop());
            }
            S1.push(data);
            while(!S2.isEmpty()){
                S1.push(S2.pop());
            }
        }
        public static int remove(){
            if(S1.isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
           return S1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return S1.peek();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
