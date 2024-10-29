import java.util.HashMap;

public class LargestSubArraySumZero {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                maxLen = Math.max(maxLen, (i - map.get(sum)));
            }
        }
        System.out.println(maxLen);
    }
}
