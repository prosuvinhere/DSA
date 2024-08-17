import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{

  public static void rev(Queue<Integer> q){
    Stack<Integer> s = new Stack<>();
    int size = q.size();
    for(int i = 0; i < size; i++){
      s.push(q.remove());
    }
    for(int j = 0; j < size; j++){
      q.add(s.pop());
    }
    for(int  i=0 ; i< size;i++){
      System.out.println(q.remove());
    }
  }
  
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    for(int  i =1 ; i<=10;i++){
      q.add(i);
    }
    rev(q);
  }
}
