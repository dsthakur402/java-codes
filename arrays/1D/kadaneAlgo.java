public class kadaneAlgo {
        public static void subArrMaxSum(int a[])
        {
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;
           
            for(int i=0;i<a.length;i++)
            {
                currSum+=a[i];
                if (currSum<0)
                {
                    currSum=0;
                }
                maxSum=Math.max(currSum,maxSum);
            }
              
                
                System.out.println("maximum sum :"+maxSum);
               
        }
        public static void main(String[] args) {
            int[] a = {-2, 3, 4, 5, -6 };
    
            subArrMaxSum(a);
        }
    }

