*public class friendsPairingProblem
{
    public static int findWays(int n)
    {
        // base case
        if(n==1||n==2)
        {
            return n;
        }
        return findWays(n-1)+(n-1)*findWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findWays(3));
    }
}