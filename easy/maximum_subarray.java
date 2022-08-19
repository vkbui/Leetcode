class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0]; // value to iterate and add next value
        int max = nums[0]; // keeps track of largest sum so far
        
        for (int i = 1; i < nums.length; i += 1) {
            if (sum < 0) { 
                sum = nums[i]; // move to next value
            }
            else {
                sum += nums[i]; // add on to current value
            }
            
            if (sum > max) { // if new value is greater than max, store in max
                max = sum;
            }
        }
        return max;
    }
}   