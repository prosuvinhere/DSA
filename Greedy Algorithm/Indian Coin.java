import java.util.*;

public class Main {
  public static void main(String[] args){
    int[] arr = {1,2,5,10,20,50,100,500,2000};
    int amt = 590;
    int count = 0 ;
    for(int i = arr.length -1 ; i >= 0; i-- ){
        while(arr[i] <= amt){
          if(amt == 0){
            break;
          }
          amt = amt - arr[i];
          System.out.println(arr[i]);
          count++;
        }
      }
    System.out.println(count);
  }
}
