import java.util.*;
public class dequ{
    public static void main(String[] args) {
      Deque<Integer> deque = new LinkedList<>();;
      deque.addFirst(7);
      deque.addFirst(2);
      deque.addFirst(3);
      System.out.println(deque);
      deque.removeLast();
      System.out.println(deque);    
    }
}