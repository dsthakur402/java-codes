public class bruteForce {
    public static void maxSumSubarr(int a[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i =0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                 currSum =0;
               for (int k=i;k<=j;k++)
               {
                    System.out.print(a[k]+" ");
                    currSum += a[k];
               }
               
                System.out.println(" : "+currSum);
                if(maxSum<currSum)
                {
                   maxSum=currSum;
                }
            }
          
        
        }      
            
            System.out.println("maximum sum :"+maxSum);
    }  
    
         

    public static void main(String[] args) {
        int[] a={2,3,4,5,6};
         maxSumSubarr(a);
    }
    
}
