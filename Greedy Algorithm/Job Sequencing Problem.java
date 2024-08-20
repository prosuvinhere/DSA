import java.util.*;

public class Main{
  public static class Jobclass{
    int index;
    int profit;
    int deadline;
    public Jobclass(int i,int p,int d){
      index = i;
      profit = p;
      deadline= d;
    }
  }
  
  public static void main(String[] args){
    int[][] given = {{4,20},{1,10},{1,40},{1,30}};
    
    ArrayList<Jobclass> jobArr = new ArrayList<>();

    for(int i = 0; i < given.length; i++){
      jobArr.add(new Jobclass(i,given[i][1],given[i][0]));
    }

    Collections.sort(jobArr,(a,b) -> b.profit - a.profit);
    int time =0;
    for(int i = 0;i<jobArr.size();i++){
      Jobclass curr = jobArr.get(i);
      if(curr.deadline > time){
        System.out.println(curr.index);
        time++;
      }
    }
    System.out.println(time);
  }
}
