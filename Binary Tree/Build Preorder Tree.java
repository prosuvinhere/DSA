import java.util.*;

public class Main{

  public static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static class BT{
    public static int idx = -1;
    public static Node Buildtree(int[] nodes){
      idx++;
      if(nodes[idx] == -1){
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = Buildtree(nodes);
      newNode.right = Buildtree(nodes);

      return newNode;
    }
  }

  public static void main(String[] args){
    int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BT tree = new BT();
    Node nice = tree.Buildtree(nodes);
    System.out.println(nice.data);
  }
}
