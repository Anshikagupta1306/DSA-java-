import java.util.LinkedList;
public class mergeSortLL {
public static int findmid(LinkedList<Integer> l){
   return (l.size()/2);
}
public static LinkedList<Integer> merge(LinkedList<Integer> l1,LinkedList<Integer>l2){
    LinkedList<Integer> result = new LinkedList<>();
    int i=0,j=0;
    while(i<l1.size() && j<l2.size()){
        if(l1.get(i)<l2.get(j)){
            result.add(l1.get(i));
            i++;
        }
        else{
            result.add(l2.get(j));
            j++;
        }
    }
    while(i<l1.size()){
        result.add(l1.get(i));
        i++;
    }
    while(j<l2.size()){
        result.add(l2.get(j));
        j++;
    }
    return result;
}
public static LinkedList<Integer> mergesort(LinkedList<Integer>list){
    if(list.size()<=1){
        return list;
    }
    int mid=findmid(list);
    LinkedList<Integer> left = new LinkedList<>();
    LinkedList<Integer>right = new LinkedList<>();
    for(int i=0;i<mid;i++){
        left.add(list.get(i));
    }
    for(int i=mid;i<list.size();i++){
        right.add(list.get(i));
    }
    LinkedList<Integer> sortedleft = mergesort(left);
    LinkedList<Integer> sortedright = mergesort(right);
    return merge(sortedleft, sortedright);
}
  public static void main(String args[]){
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(4);
    ll.add(3);
    ll.add(7);
    ll.add(1);
    ll.add(0);
    System.out.println("original list:"+ll);
   ll= mergesort(ll);
    System.out.println("sorted list:"+ll);
  }  
}
