public class power {
    public static int power(int n,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        int ans=power(n,(pow-1)/2)*power(n,(pow-1)/2);
        if(pow%2!=0)
        {
            ans=n*power(n,pow/2)*power(n,pow/2);
        }
          return ans;


        
    }
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
    
}
