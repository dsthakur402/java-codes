public class linearSearch {
    public static int linearsearch(int numbers[],int key)
    {
        int largest = Integer.MIN_VALUE;

        for( int i=0;i<numbers.length ; i++ )
        {
            // if(numbers[i]==key)
            // {
            //     return i ;

            // }
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
        
        }
       
        return largest;
        
        // return -1;
    }
    public static void main(String[] args) {
        int numbers[]={3,7,8,9,50,4};
        int key =7;
        int index = linearsearch(numbers, key);
        System.out.println("the largest no . is :"+linearsearch(numbers, key));
        // if (index==-1)
        // {
        //     System.out.println("nit found");
        // }
        // else
        // {
        //     System.out.println("key at index:"+ index);
        // }
    }
    
}
 