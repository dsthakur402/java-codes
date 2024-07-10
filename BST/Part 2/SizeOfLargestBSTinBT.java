public class SizeOfLargestBSTinBT {
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
    static class Info{
        boolean isBST;
        int size;
        int max; 
        int min;
        int wt;
        Info(boolean isBST, int s, int max, int min, int wt){
            this.isBST = isBST;
            this.size = s;
            this.max = max;
            this.min = min;
            this.wt = wt;
        }
    }

    public static int maxBST = 0;
    public static int maxWT = 0;

    public static Info largeBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
        Info leftInfo = largeBST(root.left);
        Info rightInfo = largeBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int wt = leftInfo.wt + rightInfo.wt + root.data;
        // System.out.println("weight = " + wt + " " + l);   
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, max, min, wt);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxWT = Math.max(maxWT, wt);
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, max, min, wt);
        }

        return new Info(false, size, max, min, wt);
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        inOrder(root);

        largeBST(root);
        System.out.println();
        System.out.println("size of largest BST is = " + maxBST);
        System.out.println("weight of largest BST is = " + maxWT);
        
        
    }

    
}
