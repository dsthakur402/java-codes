public class subArr 
{
    public static void subarr(int a[])
    {
        
        for (int i =0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
               for (int k=i;k<=j;k++)
               {
                    System.out.print(a[k]+" ");
               }
                System.out.println();
            }
            System.out.println();
        
        }      
             

    }
         

    public static void main(String[] args) {
        int[] a={2,3,4,5,6};
        subarr(a);
    }
    
}
