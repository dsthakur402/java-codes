public class AVLtree {
    public static Node root;

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static int height(Node root) {
        return (root == null) ? 0 : root.height;
    }

    public static int getBF(Node root) {
        return (root == null) ? 0 : height(root.left) - height(root.right);
    }

    public static Node leftRotate(Node X) {
        Node Y = X.right;
        Node T2 = Y.left;
        Y.left = X;
        X.right = T2;
        X.height = Math.max(height(X.left), height(X.right)) + 1;
        Y.height = Math.max(height(Y.left), height(Y.right)) + 1;
        return Y;
    }

    public static Node rightRotate(Node Y) {
        Node X = Y.left;
        Node T2 = X.right;
        Y.left = T2;
        X.right = Y;
        X.height = Math.max(height(X.left), height(X.right)) + 1;
        Y.height = Math.max(height(Y.left), height(Y.right)) + 1;
        return X;
    }

    public static Node insertNode(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insertNode(root.left, key);
        } else if (key > root.data) {
            root.right = insertNode(root.right, key);
        } else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int bf = getBF(root);

        // Left Left Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }
        // Right Right Case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }
        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insertNode(root, 10);
        root = insertNode(root, 20);
        root = insertNode(root, 30);
        root = insertNode(root, 40);
        root = insertNode(root, 50);
        root = insertNode(root, 25);

        /*
         * AVL Tree
         *      30
         *     /  \
         *   20    40
         *  /  \     \
         * 10  25    50
         */
        preorder(root);
    }
}
