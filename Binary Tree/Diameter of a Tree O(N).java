import java.util.*;

public class Main{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    
    public static int diam(Node root){
        if(root == null){
            return 0;
        }
        int ldiam = diam(root.left);
        int lh = height(root.left);
        int rdiam = diam(root.right);
        int rh = height(root.right);
        int self = lh+rh+1;
        
        return Math.max(self,Math.max(ldiam,rdiam));
    }
    
    public static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    
    public static Info diam2(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info infoleft = diam2(root.left);
        Info inforight = diam2(root.right);
        int diam = Math.max(infoleft.ht+inforight.ht+1,Math.max(infoleft.diam,inforight.diam));
        int ht = Math.max(infoleft.ht,inforight.ht) + 1;
        return new Info(diam,ht);
    }
    
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println(diam2(root).diam);
        
    }
}
