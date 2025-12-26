import java.util.*;
public class Iteration_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China", 200);
        hm.put("Nepal", 300);
        hm.put("Indonesia", 400);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String k : keys){
            System.out.println("keys = "+k +" value = "+hm.get(k));
        }
    }
}
