import java.util.*;

public class Main{
  public static void main(String[] args){
    int[] val = {60,100,120};
    int[] w = {10,20,30};
    double cap = 50;
    double maxval = 0;

    double [][] arr = new double[w.length][3];
    for(int i = 0;i<w.length;i++){
      arr[i][0] = val[i]/(double)w[i]; // ratio
      arr[i][1] = val[i]; // value
      arr[i][2] = w[i]; // weight
    }

    Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));
    

    for(int i = w.length-1 ; i>=0;i-- ){
      if(cap >= arr[i][2]){
        maxval = maxval+arr[i][1];
        cap = cap - arr[i][2];
      }else{
        maxval = maxval+arr[i][0]*cap;
        break;
      }
    }
    System.out.println(maxval);
  }
}
