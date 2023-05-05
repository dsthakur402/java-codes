public class trapRainWater {
    public static int calcTrapWater(int height[]) 
    {
        int n=height.length;
        //calc left max boundary
         int leftMax[] = new int[n];
         leftMax[0]=height[0];
         for (int i = 1; i < n; i++)
         {
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
         }
         
        //calc right max boundary
          int rightMax[] = new int[n];
          rightMax[n-1]=height[n-1];
          for (int i = n-2; i>=0; i--)
         {
             rightMax[i]=Math.max(rightMax[i+1],height[i]);
         }
        
        //calc waterlevel =min(leftmax,rightmax)
        int trapWater=0;
        for(int i=0;i<n;i++)
        {
        int waterlevel=Math.min(leftMax[i],rightMax[i]);
         trapWater += waterlevel-height[i];
        }
        return trapWater;
    }
    public static void main(String[] args) 
    {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(calcTrapWater(height));

    }
}

