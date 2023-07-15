public class arrayBacktracking {
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[],int si,int val)
    {
        // basre case
        if(si==arr.length)
        {
            printArr(arr);
            return;
        }
        arr[si]=val;
        changeArr(arr,si+1,val+1);
        arr[si]-=2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
