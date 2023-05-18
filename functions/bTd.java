import java.util.*;
public class bTd{
    public static void bTd(int n)
    {
        int dec=0;
        int pow=0;
        while(n>0)
        {
          int ld=n%10;
          dec=dec+((int)Math.pow(2,pow)*ld);
          n=n/10;
          pow++;
        }
        System.out.println("deciaml no. is:"+dec);  
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a binary no. :");
        int n = s.nextInt();
        bTd(n);
    }
}

