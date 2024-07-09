public class MirrorBST {
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

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < nodes.length; i++){
            root = bst(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println("mirror image of BST");
        mirror(root);
        inOrder(root);
    }
}
