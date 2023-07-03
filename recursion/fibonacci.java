public class fibonacci {
    public static int fibonacciNthterm(int n){
        if(n==0||n==1)
        {
            return n;
        }
        int fib=fibonacciNthterm(n-1)+fibonacciNthterm(n-2);
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibonacciNthterm(25));
    }
}
