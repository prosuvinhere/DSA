import java.util.*;

public class Main{
  public static void main(String[] args){
    int[] arr1 = {1,2,3};
    int[] arr2 = {3,2,1};
    int sum = 0;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i = 1; i < arr1.length; i++){
      sum += Math.abs(arr1[i] - arr2[i]);
    }
    System.out.println(sum);
  }
}
