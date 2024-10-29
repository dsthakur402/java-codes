import java.util.Arrays;

public class Trie {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord = false;

        Node() {
            Arrays.fill(children, null);
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

    public static boolean wordBreak(String key){
        if (key.isEmpty()) {
            return true;
        }
        for(int i = 1; i <= key.length(); i++) {
            if(search(key.substring(0, i))){
                if(wordBreak(key.substring(i))){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] wordStrings = {"i", "like", "samsung", "sam", "mobile", "ice"};
        String key = "ilikesjdj";

        for(String word : wordStrings){
            insert(word);
        }
        System.out.println(wordBreak(key));
    }
}