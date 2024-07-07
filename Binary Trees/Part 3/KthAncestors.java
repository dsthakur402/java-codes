public class KthAncestors {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static int kthAncestorNode(Node root, int n, int k) {
        if (root == null) return -1;
        if (root.data == n) return 0;
        int leftDis = kthAncestorNode(root.left, n, k);
        int rightDis = kthAncestorNode(root.right, n, k);

        // Fix the condition to check both leftDis and rightDis
        if (leftDis == -1 && rightDis == -1) { 
            return -1;
        }

        int max = Math.max(leftDis, rightDis) + 1;

        if (max == k) {
            System.out.println(root.data);
            // return -1; // Added semicolon to fix syntax error
        }

        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        // Updated: Removed print statement as the method handles printing internally
        kthAncestorNode(root, 4, 1);
    }
}
