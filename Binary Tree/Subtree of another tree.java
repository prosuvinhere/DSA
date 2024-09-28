import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize Node with data
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to check if two trees are identical
    public static boolean isIdentical(Node root, Node sub) {
        if (root == null && sub == null) {
            return true;
        }
        if (root == null || sub == null || root.data != sub.data) {
            return false;
        }
        // Recursively check if left and right subtrees are identical
        return isIdentical(root.left, sub.left) && isIdentical(root.right, sub.right);
    }

    // Method to check if sub is a subtree of root
    public static boolean isSub(Node root, Node sub) {
        if (root == null) {
            return false;
        }
        // Check if current nodes match and if so, check if they are identical
        if (root.data == sub.data && isIdentical(root, sub)) {
            return true;
        }
        // Recursively check left and right subtrees
        return isSub(root.left, sub) || isSub(root.right, sub);
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

        // Print the result of isSub to check if subroot is a subtree of root
        System.out.println(isSub(root, subroot));
    }
}
