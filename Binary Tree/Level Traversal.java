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
    
    public static void inorder(Node root){

      if(root == null){
        return;
      }
      postorder(root.left);
      System.out.println(root.data);
      postorder(root.right);
    }
    
    public static void preorder(Node root){

      if(root == null){
        return;
      }
      System.out.println(root.data);
      postorder(root.left);
      postorder(root.right);
    }

    public static void LevelOrder(Node root){
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
        Node curr = q.remove();
        if(curr == null){
          System.out.println("");
          if(q.isEmpty()){
            return;
          }else{
            q.add(null);
          }
        }else{
          System.out.print(curr.data+ " ");
          if(curr.left != null){
            q.add(curr.left);
          }
          if(curr.right != null){
            q.add(curr.right);
          }
        }
      }
    }
  }

  public static void main(String[] args){
    int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BT tree = new BT();
    Node root = tree.Buildtree(nodes);
    // System.out.println(root.data);
    tree.LevelOrder(root);
  }
}
