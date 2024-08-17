import java.util.LinkedList;
import java.util.Queue;

public class Main{

  public static void inter(Queue<Integer> q1){
    Queue<Integer> q2 = new LinkedList<>();
    int size = q1.size();
    for(int i=0; i < size/2; i++){
      q2.add(q1.remove());
    }
    while(!q2.isEmpty()){
      q1.add(q2.remove());
      q1.add(q1.remove());
    }
    for(int i = 0 ; i< size;i++){
      System.out.println(q1.remove());
    }
  }
  
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    for(int  i =1 ; i<=10;i++){
      q.add(i);
    }
    inter(q);
  }
}
