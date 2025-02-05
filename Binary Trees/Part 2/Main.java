// You are given an array of A with N positive integers. You have to answer Q queries. For each query you will be 
// given two integers  L and R. You have to determine whether the subarray A[L…R] is “k-symmetric”. 
// An array of n elements is said to be k-symmetric if an integer k exists such that the sum of 
// the first k elements of the subarray is equal to the sum of the last n-k+1 elements. 
// For each query, if the sub-array is k-symmetric, output k, else output -1.

// Sample Input:
// N = 8 
// Q = 3
// A = 2 3 1 2 3 3 5 6
public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 3, 3, 5, 6};
        int N = arr.length;
        int Q = 3;
        int q[][] = {{1, 8}, {3, 6}, {2, 6}};
        
        // Precompute prefix sum
        int prefixSum[] = new int[N + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        for (int i = 0; i < Q; i++) {
            System.out.println("Query " + (i + 1));

            int L = q[i][0] - 1;
            int R = q[i][1] - 1;
            int n = R - L + 1;

            // Calculate sum of subarray
            int sum = prefixSum[R + 1] - prefixSum[L];

            // Check for k-symmetry
            int k = -1;
            for (int j = 1; j <= n; j++) {
                int leftSum = prefixSum[L + j] - prefixSum[L];
                int rightSum = sum - leftSum;
                if (leftSum == rightSum) {
                    k = j;
                    break;
                }
            }

            System.out.println("output : " + k);
            System.out.println();
        }
    }
}

// omm bhai main subha se ise optimized krne ka try krra lekin O(Q*N) hi ja rhi try krke bta. mera no. bnd h isi doc main reply krdio 