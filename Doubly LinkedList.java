public class Main{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head  = newNode;
        size++;
    }
    
    public static int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return 80085;
        }
        
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size --;
        return val;
    }
    
    public static void print(Node head){
        Node temp = head;
        System.out.print("null <-> ");
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    public static void rev(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public static void main(String args[]){
        Main dll = new Main();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.rev();
        dll.print(head);
    }
}











