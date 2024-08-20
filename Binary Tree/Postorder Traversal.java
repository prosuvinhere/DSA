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
    public static void postorder(Node root){

      if(root == null){
        return;
      }
      postorder(root.left);
      postorder(root.right);
      System.out.println(root.data);
    }
  }

  public static void main(String[] args){
    int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BT tree = new BT();
    Node root = tree.Buildtree(nodes);
    // System.out.println(root.data);
    tree.postorder(root);
  }
}
