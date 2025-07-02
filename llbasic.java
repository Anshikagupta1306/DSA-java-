import java.util.*;
public class llbasic {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public static void addFirst(int data){
        node newnode = new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        size++;
    }
    public static void addLast(int data){
        node newnode = new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    public static void addatidx(int idx,int data){
        int i=0;
        node newnode=new node(data);
        node temp = head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    public static void removefirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        else{
            head=head.next;
            size--;
            return;
        }
             
    }
    public static void removelast(){
         node temp=head;
        if(size==0){
           System.out.println("LinkedList is empty");
        }
        if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        else{
           while(temp.next!=tail){
                temp=temp.next;
           }
            temp.next=null;
                 tail=temp;
                 size--;
                 return;
        }
    }
    public static void printll(){
        if(head==null){
            System.out.println("LL is empty!");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        llbasic ll = new llbasic();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addatidx(1, 6);
        ll.removefirst();
        ll.removelast();
        System.out.println(ll.size);
        ll.printll();
    }
}
