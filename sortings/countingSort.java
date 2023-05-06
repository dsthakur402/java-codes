public class countingSort 
{
    public static void sort(int a[]) 
    {
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++)
        {
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int j=0;j<a.length;j++)
        {
            count[a[j ]]++;
        }

        int j=0;
        for (int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
            a[j]=i;
            j++;
            count[i]--;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        int a[]={5,4,3,2,5,4,5,4,1};
        sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
