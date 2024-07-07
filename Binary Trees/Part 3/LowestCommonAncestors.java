import java.util.*;

public class LowestCommonAncestors {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca1(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null; // If one of the nodes is not present
        }

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    public static Node buildTree() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();
        Node root = new Node(rootValue);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            System.out.println("Enter left child of " + currentNode.data + " (enter -1 if no left child): ");
            int leftValue = scanner.nextInt();
            if (leftValue != -1) {
                currentNode.left = new Node(leftValue);
                queue.add(currentNode.left);
            }

            System.out.println("Enter right child of " + currentNode.data + " (enter -1 if no right child): ");
            int rightValue = scanner.nextInt();
            if (rightValue != -1) {
                currentNode.right = new Node(rightValue);
                queue.add(currentNode.right);
            }
        }

        return root;
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(rightLca == null){
            return leftLca;
        }

        if(leftLca == null){
            return rightLca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = buildTree();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first node value (n1): ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second node value (n2): ");
        int n2 = scanner.nextInt();

        Node lcaNode = lca2(root, n1, n2);
        if (lcaNode != null) {
            System.out.println("Lowest common ancestor of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        } else {
            System.out.println("One of the nodes is not present in the tree.");
        }

        scanner.close();
    }
}
