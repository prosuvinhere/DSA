import java.util.*;

public class Main{
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return 80085;
            }
            int data = s1.pop();
            System.out.println(data);
            return data;
        }
    }
    
    
    
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
