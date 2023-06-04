public class fastExponention 
{
    public static int calculate(int n, int pow)
    {
        int ans =1;
        while(pow > 0)
        {
            if((pow&1)!=0)
            {
                ans=ans*n;
            }
            n=n*n;
            pow=pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) 
    {
       System.out.println( calculate(5,3));
    }
}
