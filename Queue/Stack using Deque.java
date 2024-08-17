import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main{
  public static class Stack{
    Deque<Integer> d = new LinkedList<>();
    public void push(int data){
      d.addLast(data);
    }
    public int pop(){
      if(d.isEmpty()){
        System.out.println("Empty");
        return 80085;
      }else{
        return d.removeLast();
      }
    }
    public int peek(){
      if(d.isEmpty()){
        System.out.println("Empty");
        return 80085;
      }else{
        
        return d.getLast();
      }
    }
  }

  public static void main(String[] args){
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.pop();
    System.out.println(s.peek());
  }
}
