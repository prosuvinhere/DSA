public class Main {
    
    public static class Stack {
        
        public static class Node {
            int data;
            Node next;
            
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        
        private Node head;
        
        public Stack() {
            this.head = null;
        }
        
        public boolean isEmpty() {
            return head == null;
        }
        
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        
        public int pop() {
            if (isEmpty()) {
                return -1; // Returns -1 if stack is empty
            }
            int topData = head.data;
            head = head.next;
            return topData;
        }
        
        public int peek() {
            if (isEmpty()) {
                return -1; // Returns -1 if stack is empty
            }
            return head.data;
        }
    }
    
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
