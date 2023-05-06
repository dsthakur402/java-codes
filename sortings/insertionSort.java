public class insertionSort 
{
    public static void sort(int arr[]) 
    {   
        
        for(int i=1;i<arr.length-1;i++)
        {
            int prev=i-1;
            int curr=arr[i];
            while (prev>=0 && arr[prev]>curr) 
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
            
           
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={5,4,3,8,6};
        sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
