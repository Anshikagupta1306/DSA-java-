import java.util.LinkedList;

public class Zigzagll {
    public static LinkedList<Integer> zigzag(LinkedList<Integer>list){
        LinkedList<Integer> result = new LinkedList<>();
        int i=0;
        int j=list.size()-1;
        boolean turn = true;
        while(i<=j){
          if(turn){
            result.add(list.get(i));
            i++;
          }
          else{
            result.add(list.get(j));
            j--;
          }
          turn=!turn;
        }
        return result;
    }
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println("original list:"+list);
    list= zigzag(list);
    System.out.println("new linkedlist:"+list);
  }    
}
