public class tilingProblem {
    public static int find(int n)
    {    
        // floor 2*n & tile 2*1
        // base case
        if(n==0||n==1)
        {
            return 1;
        }
        return find(n-1)+find(n-2);
    }
    public static void main(String[] args) {
        System.out.println(find(4));
    }
}
