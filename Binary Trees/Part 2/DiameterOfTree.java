public class DiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        int height;
        int diameter;
        Info(int h, int d) {
            this.height = h;
            this.diameter = d;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }


        // public static int diameter(Node root){
        //     if(root == null) return 0;
        //     int ldm = diameter(root.left);
        //     int lht = diameter(root.left);

        //     int rdm = diameter(root.right);
        //     int rht = diameter(root.right);

        //     int selfDiam = lht + rht + 1;
            
        //     return Math.max(selfDiam, Math.max(ldm, rdm));
        // }

        public static Info diameter(Node root) {
            if (root == null) return new Info(0, 0);

            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int myHeight = Math.max(leftInfo.height, rightInfo.height) + 1;
            int myDiameter = Math.max(leftInfo.diameter, rightInfo.diameter);
            int rootDiameter = leftInfo.height + rightInfo.height + 1; // Diameter passing through the root

            myDiameter = Math.max(myDiameter, rootDiameter);

            return new Info(myHeight, myDiameter);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root = " + root.data);

        System.out.println("diameter of tree is : " + tree.diameter(root).diameter);
    }
}
