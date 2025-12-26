import java.util.*;
public class HashMap_Operations {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("nepal", 300);
        System.out.println("hm = " + hm);
        System.out.println("size = "+hm.size());
        int pop = hm.get("India");
        System.out.println("Population of India: " +pop);
        System.out.println("check if hm contains India " + hm.containsKey("India") );
        hm.remove("nepal");
        System.out.println(hm);
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
