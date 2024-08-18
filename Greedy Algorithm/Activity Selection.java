import java.util.*;

public class Main{
  public static void activity(int[] start, int[] end){
    int arr[][] = new int[start.length][3];

    for(int i = 0; i < start.length; i++){
      arr[i][0] = i;
      arr[i][1] = start[i];
      arr[i][2] = end[i];
    }

    // sorting 2D array

    Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

    ArrayList<Integer> list = new ArrayList<>();
    list.add(arr[0][0]);
    int act  = 1;
    int lastEndTime = arr[0][2];
    for(int i=1;i<start.length;i++){
      if(start[i] >= lastEndTime){
        act++;
        lastEndTime = arr[i][2];
        list.add(i);
      }
    }
    System.out.println(act);
    for(int j = 0; j< list.size(); j++){
      System.out.println("A"+list.get(j));
    }
  }

  public static void main(String[] args){
    int[] start = {1,3,0,5,8,5};
    // sorted in endtime basis.
    int[] end = {2,4,6,7,9,9};
    activity(start,end);

  }
}
