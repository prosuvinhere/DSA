
public class Main{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head = null;
    public static Node tail = null;
    
    public static class Queue{
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null ){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return 80085;
            }
            int temp = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return temp;
        }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return 80085;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}







