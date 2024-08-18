import java.util.*;

public class Main{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    int[][] arr = {{5,24},{39,60},{5,28},{27,40},{50,90}};
    Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
    int chain = 1; 
    int last  = arr[0][1];
    for(int i = 1; i< arr.length; i++){
      if(arr[i][0] > last){
        chain++;
        last = arr[i][1];
      }
    }
    System.out.println(chain);
  }
}
