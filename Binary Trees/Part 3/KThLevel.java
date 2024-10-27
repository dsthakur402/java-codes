import java.util.*;

public class KThLevel{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    // using recursion
    public static void findKthLevelUsingRec(Node root, int level, int k){
        if(root == null) return;
        if(level == k){
            System.out.println(root.data);
            return;
        }
        findKthLevelUsingRec(root.left, level + 1, k);
        findKthLevelUsingRec(root.right, level + 1, k);
    }

    // using level order traversal
    public static void findKthLevelUsingLOT(Node root, int k){
        System.out.println("Nodes present at level " + k + " are using level order traversal: ");
        if(root == null || k == 1){
            System.out.println(root.data);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int i = 1;
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(i > k) break;
            if(curr == null){
                i++;
                if(!q.isEmpty()){
                    q.add(null);
                } else {
                    break;
                }
            } else {
                if(i == k){ 
                    System.out.println(curr.data);
                }
                if(curr.left != null){
                        q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        findKthLevelUsingLOT(root, 2);
        System.out.println();
        int k  = 3;
        System.out.println("Nodes present at level " + k + " are using Recusrsive function:");
        findKthLevelUsingRec(root, 1, k);
    }
}