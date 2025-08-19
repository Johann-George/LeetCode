class Solution {
    public int maxProfit(int[] prices) {
        int l=0, r=1;
        int maxPrice = 0;
        while(l<=r && r<prices.length){
            if(prices[l]>prices[r]){
                l=r;
            }
            else{
                maxPrice = Math.max(maxPrice,prices[r]-prices[l]);
            }
            r++;
        }
        return maxPrice;
    }
}