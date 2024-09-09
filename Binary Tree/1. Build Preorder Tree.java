 public class Main{
     public static class Node{
         int data;
         Node left;
         Node right;
         Node(int data){
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
     
     public static class tree{
         static int ptr = -1;
         public static Node pre(int[] arr){
             ptr++;
             if(arr[ptr] == -1){
                 return null;
             }
            Node newNode = new Node(arr[ptr]);
            newNode.left = pre(arr);
            newNode.right = pre(arr);
            
            return newNode;
         }
     }
     
     
     public static void main(String[] args){
         int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         tree t = new tree();
         
         Node head = t.pre(nodes);
         
         System.out.println(head.data);
         
     }
 }
