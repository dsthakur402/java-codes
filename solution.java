import java.util.Scanner;

public class solution
{
    public static void main(String[] args) 
    {           
        int[] a=new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int evenSum=0,oddSum=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                evenSum+=a[i];
            }
            else
            {
                oddSum+=a[i];
            }
        }
        System.out.println("evensum is:"+evenSum+"\noddsum is:"+oddSum);
    }
}