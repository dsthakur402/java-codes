import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree{
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

    static class BinaryTree{
        public static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }   
        
        public static void preOrder(Node root){
            if(root == null) return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(null);
                    }else {
                        break;
                    }
                }else{
                        System.out.print(curr.data + " ");
                        if(curr.left != null){
                            q.add(curr.left);
                        }
                        if(curr.right != null){
                            q.add(curr.right);
                        }
                }
            }
        }

        public static int height(Node root){
            if(root == null) return 0;
            return 1 + Math.max(height(root.left), height(root.right));
        }

        public static int count(Node root){
            if(root == null) return 0;
            return 1 + count(root.left) + count(root.right);
        }
        
        public static int sum(Node root){
            if(root == null) return 0;
            return root.data + sum(root.left) + sum(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};


        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root = " + root.data );


        System.out.print("Pre Order traversal: ");
        tree.preOrder(root);


        System.out.println();
        System.out.print("In Order traversal: ");
        tree.inOrder(root);


        System.out.println();
        System.out.print("Post Order traversal: ");
        tree.postOrder(root);


        System.out.println();
        System.out.println("Level Order traversal: ");
        tree.levelOrder(root);

        System.out.println("height of the tree is: " + tree.height(root));
       
       
        System.out.println("total nodes of the tree is: " + tree.count(root));
        System.out.println("total sum of nodes of the tree is: " + tree.sum(root));
    }
}


// TC : O(N)
