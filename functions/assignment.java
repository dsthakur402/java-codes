import java.util.Scanner;

public class assignment 
{
    public static boolean isEven(int n)
    {
       if(n%2==0)
       {
        return true;
       }
       return false;
    }
    public static boolean isPalindrome(int n)
    {
        int rev=0;
        int original=n;
        while (n>0) 
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==original)
         return true;
        else
         return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("enter a no.:");
         int n=sc.nextInt();
        System.out.println(isEven(n));
        System.out.println(isPalindrome(n));
    }
}
