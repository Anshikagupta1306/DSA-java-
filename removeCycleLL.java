public class removeCycleLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public static Node head;
    public static Node tail;
    public static void removecycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    } 
    public static void printll(){
        if(head==null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        
        removecycle();
        printll();
     }
}
