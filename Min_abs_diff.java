import java.util.*;
public class Min_abs_diff {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,1,3};
        int mindiff=0;
        for(int i=0;i<a.length;i++){
            mindiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println("min absolute difference of pairs = "+mindiff);
    }
}
