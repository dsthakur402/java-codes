public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node bst(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = bst(root.left, val);
        } else {
            root.right = bst(root.right, val);
        }
        return root;
    }

    public static void printRange(Node root, int k1, int k2){
        if(root == null) return;
        if(root.data >= k1 && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if(root.data <= k1){
            printRange(root.right, k1, k2);
        } else {
            printRange(root.left, k1, k2);
        }
    }
    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < nodes.length; i++){
            root = bst(root, nodes[i]);
        }
        printRange(root, 5, 14);
    }
}
