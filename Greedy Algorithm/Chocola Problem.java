import java.util.*;

public class Main{
  public static void main(String args[]){
    Integer[] vertiCost = {2,1,3,1,4};
    Integer[] horiCost = {4,1,2};

    int vertilen = vertiCost.length;
    int horilen = horiCost.length;

    Arrays.sort(vertiCost, Collections.reverseOrder());
    Arrays.sort(horiCost, Collections.reverseOrder());

    int cost = 0;
    int verticuts = 1;
    int horicuts = 1;
    int hp = 0;
    int vp = 0;

    while(hp < horilen && vp < vertilen){
      if(vertiCost[vp] >= horiCost[hp]){
        cost += vertiCost[vp] * horicuts;
        verticuts++;
        vp++;
      }else{
        cost += horiCost[hp] * verticuts;
        horicuts++;
        hp++;
      }
    }

    while(hp < horilen){
      cost += horiCost[hp] * verticuts;
      horicuts++;
      hp++;
    }
    while(vp < vertilen){
      cost += vertiCost[vp] * horicuts;
      verticuts++;
      vp++;
    }

    System.out.print(cost);
  }
}
