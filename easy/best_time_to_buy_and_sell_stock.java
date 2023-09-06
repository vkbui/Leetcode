// 9/3/2023
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low = prices[0];
        
        for (int i = 0; i < prices.length; i += 1) {
            low = Math.min(prices[i], low); // tracks lowest price as you iterate
            max = Math.max(prices[i] - low, max); // keeps max profit
        }
        return max;
    }
}

// 2022
// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = prices[0]; // stores the lowest day
//         int profit = 0; // stores the highest profit
        
//         for (int i = 0; i < prices.length; i += 1) { // goes through every day
//             if (prices[i] < min) { // checks if less than min and stores
//                 min = prices[i];
//             }
            
//             // prices[i] - min means how much profit
//             if (profit < prices[i] - min) {
//                 profit = prices[i] - min; // checks if higher than profit and stores
//             }
//         }
//         return profit;
//     }
// }