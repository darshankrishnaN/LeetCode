class Solution {
    public int maxProfit(int[] prices) {
        int bprice = prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<bprice){
                bprice = prices[i];
            }
            else{
                int cprofit = prices[i]-bprice;
                profit =Math.max(cprofit,profit);
            }
        }
        return profit;
    }
}