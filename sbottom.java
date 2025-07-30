import java.util.*;
public class sbottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
      if(s.isEmpty()){
        s.push(data);
        return;
      }
      int top=s.pop();
      pushAtBottom(s, data);
      s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(7);
        pushAtBottom(s, 2);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
