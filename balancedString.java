import java.util.Scanner;

public class balancedString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        str.toUpperCase();
        int n=str.length();
        int l=0;
        int r=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='R'){
                r++;
            }
            if(str.charAt(i)=='L'){
                l++;
            }
            if(r==l){
                ans++;
            }
        } 
        System.out.println(ans);
        sc.close();
    }
}
