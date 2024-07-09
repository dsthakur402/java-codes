public class DeleteNodeBST {
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

    private static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node deleteNode(Node root, int val){
        if(root == null){
            return null;
        }
        if(val < root.data){
            root.left = deleteNode(root.left, val);
        } else if(val > root.data){
            root.right = deleteNode(root.right, val);
        } else {
            // case 1 root.left == null && root.riht == null
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 only one child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            // if node have two child
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
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

    public static void main(String[] args) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < nodes.length; i++){
            root = bst(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        deleteNode(root, 10);
        inOrder(root);
    }
}
