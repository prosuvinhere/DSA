import java.util.ArrayList;

public class Main{
  public static void activity(int[] start, int[] end){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    int act  = 1;
    int lastEndTime = end[0];
    for(int i=1;i<start.length;i++){
      if(start[i] >= lastEndTime){
        act++;
        lastEndTime = end[i];
        list.add(i);
      }
    }
    System.out.println(act);
    for(int j = 0; j< list.size(); j++){
      System.out.println(list.get(j));
    }
  }
  
  public static void main(String[] args){
    int[] start = {1,3,0,5,8,5};
    // sorted in endtime basis.
    int[] end = {2,4,6,7,9,9};
    activity(start,end);
    
  }
}
