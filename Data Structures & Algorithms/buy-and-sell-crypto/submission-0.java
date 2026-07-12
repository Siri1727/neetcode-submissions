class Solution {
    public int maxProfit(int[] prices) {
        int maxprice = 0;
        int minBuy = prices[0];
        for(int i : prices){
            maxprice = Math.max(maxprice,i - minBuy);
            minBuy = Math.min(minBuy,i);
        }
        return maxprice;
    }
}
