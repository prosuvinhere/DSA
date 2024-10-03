import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root, Node sub) {
        if (root == null && sub == null) {
            return true;
        }
        if (root == null || sub == null || root.data != sub.data) {
            return false;
        }
        return isIdentical(root.left, sub.left) && isIdentical(root.right, sub.right);
    }
    public static boolean isSubtree(Node root, Node sub) {
        if (root == null) {
            return false;
        }
        if (root.data == sub.data && isIdentical(root, sub)) {
            return true;
        }
        return isSubtree(root.left, sub) || isSubtree(root.right, sub);
    }

    public static void main(String[] args) {


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);


        System.out.println(isSubtree(root, subroot));
    }
}
