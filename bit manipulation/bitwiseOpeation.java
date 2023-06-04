import java.util.*;
public class bitwiseOpeation 
{
    public static int getIthBit(int n,int i)
    {
        int bitMask=1<<i;
        int ans=n&bitMask;
        if(ans==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
       
    }
    
    public static int setIthBit(int n,int i)
    {
        int bitMask=1<<i;
        int ans=n|bitMask;
        return ans;
       
    }
    public static int clearIthBit(int n,int i)
    {
        int bitMask=~(1<<i);
        int ans=n&bitMask;
        return ans;
       
    }
    public static int updateIthBit(int n,int i,int bit)
    {
        // if(bit==0)
        // {
        //     clearIthBit(n,i);
        // }
        // else
        // {
        //     setIthBit(n,i);
        // }  
        int p = clearIthBit(n,i);
        int bitMask=bit<<i;
        return p|bitMask;

    }
    public static int clearLastIbits(int n,int i)
    {
        int bitMask=(~(0)<<i);
        int ans=n&bitMask;
        return ans;
       
    }
    public static int clearRangeOfBits(int n,int i,int j)
    {
        int a=(~(0)<<j);
        int b=(1<<i)-1;
        int bitMask=a|b;
        int ans=n&bitMask;
        return ans;
       
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose your operation:\n1>getIthBit \n2>setIthBit \n3>clearIthBit \n4>updateIthbIT \n5>clearLastIbits \n6>clearRangeOfBits \nwhats your choice:");
        
        int n =sc.nextInt();
        
        switch (n) 
        {
           case 1:System.out.println(getIthBit(10,1));
            break;
           case 2:System.out.println(setIthBit(10,2));
            break;
           case 3:System.out.println(clearIthBit(10,1));
            break;
           case 4:System.out.println(updateIthBit(10,2,1));
            break;
           case 5:System.out.println(clearLastIbits(15,2));
            break;
           case 6:System.out.println(clearRangeOfBits(31,1,3));
            break;
           default:System.out.println("wrong input!!.....");   

           
        }
        
      
    }
}
