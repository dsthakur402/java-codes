 public class binarySearch {
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key=8;
        int index = binarysearch(arr,key);
        System.out.println(index);
    }
    public static int binarysearch(int[] arr,int key)
    {
        int start=0,end=arr.length-1;
       
        while (start<=end) 
        {
            int mid=start-(start-end)/2;
        
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key)
        {
            start=mid+1;
            
        }
        else
        {
            end =mid-1;
        }
    }
        return-1;
}
    
}
