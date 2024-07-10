public class SortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node buildBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        int mid = end - (end - start) / 2;
        Node root = new Node(arr[mid]);
        root.left = buildBST(arr, start, mid - 1);
        root.right = buildBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Node root = buildBST(arr, 0, arr.length - 1);
        System.out.println(root.data);
    }
}
