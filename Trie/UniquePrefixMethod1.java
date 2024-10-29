import java.util.Arrays;

public class UniquePrefixMethod1 {
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

    public static String[] findUniquePrefix(String[] arr){
        Node curr = Root;
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr[i].length(); j++) {
                int cnt = 0;
                for(int k = 0; k < 26; k++){
                    if(curr.children[k] != null){
                        cnt++;
                    }
                }
                if(cnt == 1){
                    break;
                } else {
                    sb.append(arr[i].charAt(j));
                }
                curr = curr.children[arr[i].charAt(j) - 'a'];
            }
                res[i] = sb.toString();
                curr = Root;
        }   
        return res;
    }

    public static void main(String[] args) {
        String[] arr = {"zebra", "dog", "duck", "dove"};
        for(String a : arr){
            insert(a);
        }

        String[] ans = findUniquePrefix(arr);

        for(String a : ans){
            System.out.println(a);
        }
    }
}
