public class MinDisBwTwoNodes {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }

        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    public static int calcDis(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;
        int left = calcDis(root.left, n);
        int right = calcDis(root.right, n);

        if (left == -1 && right == -1) {
            return -1;
        } else if (right == -1) {
            return left + 1; // Correct calculation when right is -1
        } else if (left == -1) {
            return right + 1; // Correct calculation when left is -1
        }

        return Math.min(left, right) + 1; // Proper distance calculation
    }

    public static int calcMinDis(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        return calcDis(lca, n1) + calcDis(lca, n2);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(calcMinDis(root, 4, 5));
    }
}
