import java.util.*;
class BuySellStock1               // in this we actually find the maxProfit means when we want to buy stock
{
    public static int buyandsellstock1(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0; i<prices.length;i++)
        {
            if(buyPrice<prices[i])           // buy value is less than current value means we are in profit 
            {
                int profit = prices[i]-buyPrice;        //finding how much exact profit
                maxProfit = Math.max(maxProfit, profit);   //but here we check if this is maxProfit or not
            }else{
                buyPrice = prices[i];         //here we update buy price
            }
        }
        return maxProfit;
    }
    public static void main(String args[])
    {
        int prices[] = {3,4,5,7,9,2};
        System.out.println(buyandsellstock1(prices));
    }
}