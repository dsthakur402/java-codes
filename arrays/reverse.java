public class reverse {
    public static void reversen(int[] a)
    {
        int start=0;
        int end =a.length-1;
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reversen(a);
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
