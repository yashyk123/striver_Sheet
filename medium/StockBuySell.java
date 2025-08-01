public class StockBuySell {

    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int maxProfit = 0;
        int buyValue = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < buyValue)
            {
                buyValue = prices[i];
            }
            else if(prices[i] - buyValue > 0)
            {
                maxProfit = Math.max(maxProfit, prices[i]-buyValue);
                //System.out.println("Buy at: " + buyValue + ", Sell at: " + prices[i] + ", Profit: " + (prices[i] - buyValue));
            }
        }
        System.out.println(maxProfit);
       
    
    }
}