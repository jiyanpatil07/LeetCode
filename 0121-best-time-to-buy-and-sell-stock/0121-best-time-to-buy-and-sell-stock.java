class Solution {
    public int maxProfit(int[] prices) {
        
        int miniPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<miniPrice){
                miniPrice=prices[i];
            }
            if(prices[i]-miniPrice>profit){
                profit=prices[i]-miniPrice;
            }
            
            
        }
        return profit;
        
    }
}