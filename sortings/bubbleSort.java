public class bubbleSort 
{
    public static void sort(int arr[]) 
    {   
        int swap=0;
        for(int i=0;i<arr.length-1;i++)
        { 
            for(int j=0;j<arr.length-1;j++)
            {   
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            } 
            if(swap==0)
            {
                System.out.println("no. of swappings:"+swap);
                break;
            }
        }
        System.out.println("no. of swappings:"+swap);
    }
    public static void main(String[] args) 
    {
        int arr[]={5,4,3,8,6,88,5,6,7,9,58};
        sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
