import java.util.*;

public class ValidateBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node bst(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = bst(root.left, val);
        } else {
            root.right = bst(root.right, val);
        }
        return root;
    }

    

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        arr.add(root.data);
        inOrder(root.right);
    }

    

    
 //-----------------------------APPROACH 1(USING INORDER TRAVERSAL)------------------------
    public static void approach1(ArrayList<Integer> arr) {
        Boolean ans = true;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) >= arr.get(i)) {
                ans = false;
                break;
            }
        }
        if (ans) {
            System.out.println("valid BST");
        } else {
            System.out.println("not a valid BST");
        }
    }
    
//----------------------------------------------------------------------------------------
// -----------------------------APPROACH 2(USING IS AND IP)--------------------------------
    
    public static void approach2(Node root) {
        int IS = findInOrderSuccessor(root.right);
        int IP = findInOrderPredessor(root.left);
        System.out.println("IS = " + IS + " IP = " + IP);
        if (IS < root.data || IP > root.data) {
            System.out.println("not valid BST");
        } else {
            System.out.println("valid BST");
        }
    }
    private static int findInOrderPredessor(Node root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(findInOrderPredessor(root.left), root.data);
        int right = Math.max(findInOrderPredessor(root.right), root.data);
        return Math.max(left, right);
    }

    private static int findInOrderSuccessor(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int left = Math.min(findInOrderSuccessor(root.left), root.data);
        int right = Math.min(findInOrderSuccessor(root.right), root.data);
        return Math.min(left, right);
    }
// -----------------------------APPROACH 3(USING MIN AND MAX OF SUBTREE)-------------------
    public static boolean approach3(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data)
            return false;
        if (max != null && root.data >= max.data)
            return false;

        return approach3(root.left, min, root) && approach3(root.right, root, max);
    }
// ------------------------------MAIN FUNCTION-------------------------------------------- 
    public static ArrayList<Integer> arr = new ArrayList<>();
    
    public static void main(String[] args) {
        int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = bst(root, nodes[i]);
        }
        inOrder(root);
        mirror(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        approach2(root);

        if (approach3(root, null, null)) {
            System.out.println("valid BST");
        } else {
            System.out.println("not a valid BST");
        }
    }
}
