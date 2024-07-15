import java.util.*;

public class KnapSackProblem {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;
        int n = val.length;
        double[][] ratio = new double[n][2];
        
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }
        
        // Sort ratio in descending order based on the second column (ratio)
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        int cap = W;
        double finalVal = 0;

        for (int i = 0; i < n; i++) {
            int idx = (int) ratio[i][0];
            if (weight[idx] <= cap) {
                finalVal += val[idx];
                cap -= weight[idx];
            } else {
                finalVal += ratio[i][1] * cap;
                break;
            }
        }
        
        System.out.println((int)finalVal);
    }
}
