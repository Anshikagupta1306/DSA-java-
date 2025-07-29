import java.util.*;
public class stackLL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            node newnode = new node(data);
            if(isEmpty()){
               head = newnode;
               return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(6);
        s.push(5);
        s.push(9);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
