class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0]; // stores the lowest day
        int profit = 0; // stores the highest profit
        
        for (int i = 0; i < prices.length; i += 1) { // goes through every day
            if (prices[i] < min) { // checks if less than min and stores
                min = prices[i];
            }
            
            // prices[i] - min means how much profit
            if (profit < prices[i] - min) {
                profit = prices[i] - min; // checks if higher than profit and stores
            }
        }
        return profit;
    }
}