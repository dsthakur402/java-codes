public class distinct {
    public static boolean checkDistinct(int nums[]) 
    {
        for(int i =0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[j]==nums[i])
                {
                    System.out.println("true");
                    return true;
                }

                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,1};
        checkDistinct(nums);
    }
    
}
