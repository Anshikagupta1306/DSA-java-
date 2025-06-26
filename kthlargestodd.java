import java.util.*;
public class kthlargestodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(i%2!=0){
              ans.add(i);
            }
        }
        int odd = ans.size();
        if(k>odd){
            System.out.println("0");
        }
        else{
           Collections.sort(ans,Collections.reverseOrder());
           System.out.println(ans.get(k-1));
        }
    }
}
