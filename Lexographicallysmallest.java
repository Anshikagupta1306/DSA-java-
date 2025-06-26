import java.util.*;
public class Lexographicallysmallest {
    public static String getsmalleststring(int n,int k){
        char result[] = new char[n];
        for(int i = n-1;i>=0;i--){
            int remaining = k-i;
            if(remaining>=26){
                result[i]='z';
                k-=26;
            }
            else{
                result[i]=(char)('a'+remaining-1);
                k-=remaining;
            }
        }
        return new String(result);
    }
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int k=sc.nextInt();
    System.out.println(getsmalleststring(n, k));
   }   
}
