Ll
public class Main{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFront(int data){
        
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addBack(int data){
        
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public void printll(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void addMid(int idx,int data){
        if(idx == 0){
            addFront(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public int removeFirst(){
        if(size == 0 ){
            return 80085;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
    public int removeLast(){
        if(size == 0 ){
            return 80085;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i< size-2;i++){
            prev = prev.next;
        }
        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    public int SearchItr(int key){
        Node temp = head;
        int idx = 0;
        while(idx < size){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    
    public int helper(int key, Node head){
        //Base case
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(key,head.next);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public int SearchRec(int key){
        return helper(key,head);
    }
    
    public void rev(){
        // intialize keeping first node in mind
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
        next = curr.next;
        curr.next = prev;
        // updating prev and curr;
        prev = curr;
        curr = next;
        }
        head = prev;
    }
    
    public void removeNthLast(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        
        if(sz == n){
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        while(i < n-sz){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
        
    }
    
    public Node Mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow; // mid 
    }
    
    public boolean checkpal(){
        if(head == null || head.next == null){
            return true;
        }
        Node Mid = Mid(head);
        
        Node curr = Mid;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    public static boolean Cycle(){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    
public static void removeCycle() {
    Node fast = head;
    Node slow = head;
    boolean hasCycle = false;

    // Detect if there is a cycle
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;

        if (fast == slow) {
            hasCycle = true;
            break;
        }
    }

    // If no cycle, return
    if (!hasCycle) {
        return;
    }

    // Find the start of the cycle
    slow = head;
    Node prev = null;
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Remove the cycle
    if (prev != null) {
        prev.next = null;
    }
}

    
    public static void main(String[] args){
        Main ll = new Main();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head.next;
        System.out.println(Cycle());
        removeCycle();
        System.out.println(Cycle());
    }
}








