import java.util.ArrayList;

public class RoofToLeafPath {
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
        inOrder(root.right);
    }

    private static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void rootTOleaf(Node root, ArrayList<Integer> path){
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootTOleaf(root.left, path);
        rootTOleaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = bst(root, nodes[i]);
        }
        
        rootTOleaf(root, new ArrayList<>());
    }
}
