import java.util.*;
public class paranthesisdp {
    public static void printbrackets(char str[],int n){
       if(n>0){
            printutil(str, 0, n, 0, 0);
        }          
    }
    public static void printutil(char str[],int pos,int n,int start,int close){
        if(close==n){
            for(int i=0;i<str.length;i++){
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        }
        if(start>close){
            str[pos]='}';
            printutil(str, pos+1, n, start, close+1);
        }
        if(start<n){
            str[pos]='{';
            printutil(str, pos+1, n, start+1, close);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char str[]=new char[n*2];
        printbrackets(str,n);
    }
}
