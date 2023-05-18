import java.util.*;
public class dTb{
    public static void bTd(int n)
    {
        int bin=0;
        int pow=0;
        while(n>0)
        {
          int ld=n%2;
         bin=bin+((int)Math.pow(10,pow)*ld);
          n=n/2;
          pow++;
        }
        System.out.println("binnary no. is:"+bin);  
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a decimal  no. :");
        int n = s.nextInt();
        bTd(n);
    }
}

