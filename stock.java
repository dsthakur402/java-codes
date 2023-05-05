public class stock {
    public static void stockSell(int price[])
    {
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;

        // #1 approach
        // System.out.println("profit on day 1 :");
        // for (int i=1;i<price.length;i++)
        // {
        //     bp=Math.min(price[i-1],bp);
        //     if(bp<price[i])
        //     {
        //     profit=price[i]-bp;
        //     }
        //     maxProfit=Math.max(profit,maxProfit);
        //     System.out.println("profit on day"+(i+1)+":"+profit);
        // }


        // #2 approach
        for (int i=0;i<price.length;i++)
        {
            if(bp<price[i])
            {
                profit=price[i]-bp;
            }
            else{
                bp=price[i];
            }
            maxProfit=Math.max(maxProfit, profit);

        }


        System.out.println("maxprofit is:"+maxProfit);
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        stockSell(price);

    }
}
