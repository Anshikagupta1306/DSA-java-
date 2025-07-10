public class dll {
   static class node{
     int data;
     node next;
     node prev;
     public node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
     }
   }
     public static node head;
     public static node tail;
     public static int size;
    
     //addfirst
     public static void addfirst(int data){
        node newnode = new node(data);
        size++;
        if(head==null){
          head=tail=newnode;
          return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
     }
     //remove head
     public static int removefirst(){
        if(head==null){
            System.out.println("linked-list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        size--;
        head=head.next;
        head.prev=null;
        return val;
     }
     //reverse
     public static void reverse(){
        node curr=head;
        node prev=null;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
     }
     //print dll
     public static void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
     }
     public static void main(String[] args) {
        dll ll = new dll();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(0);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.reverse();
        ll.print();
     }
   }  
