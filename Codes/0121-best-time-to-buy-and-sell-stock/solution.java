class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int mp=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else{
                mp=Math.max(prices[i]-buy,mp);
            }
        }
        return mp;
    }
}
