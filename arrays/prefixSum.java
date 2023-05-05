public class prefixSum {
    public static void prefixsum(int a[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int preFix[]=new int[a.length];
        preFix[0]=a[0];
        for(int i= 1;i<preFix.length;i++)
        {
            preFix[i]=preFix[i-1]+a[i];
        }
        for(int i= 0;i<preFix.length;i++)
        {
            System.out.println(preFix[i]);
        }
        for (int i =0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                  currSum = i==0 ? preFix[j] : preFix[j]-preFix[i-1];
              
                System.out.println(" : "+currSum);
                
                maxSum=Math.max(maxSum, currSum);
            }
          
        
        }      
            
            System.out.println("maximum sum :"+maxSum);
           
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6 };

        prefixsum(a);
    }
}