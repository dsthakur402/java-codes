public class SubbTree {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        public static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        private static boolean isIdentical(Node root, Node subRoot){
            if(root == null && subRoot == null){
                return true;
            }
            if(root == null || subRoot == null || root.data != subRoot.data){
                return false;
            } 
            if(!isIdentical(root.left, subRoot.left)) return false;
            if(!isIdentical(root.right, subRoot.right)) return false;
            return true;
        }

        public static boolean isSubtree(Node root, Node subRoot){
            if(root == null) return false;
            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);            
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        int[] subNodes = {2, 4, -1, -1, 5, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        BinaryTree.idx = -1;
        Node subRoot = tree.buildTree(subNodes);
        System.out.println("Root: " + root.data);
        System.out.println("SubRoot: " + subRoot.data);

        
        System.out.println(tree.isSubtree(root, subRoot));


    }
}
