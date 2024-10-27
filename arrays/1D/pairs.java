public class pairs{
    public static void pair(int a[])
    {        int tp=0;
        for (int i=0;i<a.length;i++)
        {  
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print(a[i]+","+a[j]+"  ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total no. of pairs:"+tp);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        pair(a);

    } 
}