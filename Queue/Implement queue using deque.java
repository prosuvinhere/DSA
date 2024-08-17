import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main{
  public static class Queue{
    Deque<Integer> d = new LinkedList<>();
    
    public void add(int data){
      d.addLast(data);
    }
    
    public int remove(){
      if(d.isEmpty()){
        System.out.println("Empty");
        return 80085;
      }else{
        return d.removeFirst();
      }
    }
    
    public int peek(){
      if(d.isEmpty()){
        System.out.println("Empty");
        return 80085;
      }else{
        
        return d.getFirst();
      }
    }
    
  }
  public static void main(String[] args){
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.remove();
    System.out.println(q.peek());
  }
}
