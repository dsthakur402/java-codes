import java.util.Arrays;

public class UniquePrefixMethod2 {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord = false;
        int freq;

        Node() {
            Arrays.fill(children, null);
            freq = 0;
        }
    }

    public static Node Root = new Node();
 
    public static void insert(String word){
        Node curr = Root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++;
        }
        curr.isEndOfWord = true;
    }

    public static boolean search(String word){
        Node curr = Root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEndOfWord == true;
    }

    public static void findUniquePrefix(Node root, String ans){
        if(root == null) return;
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null){
                findUniquePrefix(root.children[i],ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        Root.freq = -1;

        String[] arr = {"zebra", "dog", "duck", "dove"};
        for(String a : arr){
            insert(a);
        }

        findUniquePrefix(Root, "");

        
    }
}
