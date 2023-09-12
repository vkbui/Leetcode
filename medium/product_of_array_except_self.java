class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1; // prefix - product of ints before i
        int[] result = new int[nums.length];

        // fill result[i] w/ prefix of i
        for (int i = 0; i < result.length; i += 1) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        int postfix = 1; // postfix - product of ints after i
        // multiply each prefix in results with postfix of i
        for (int i = result.length - 1; i >= 0; i -= 1) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }

        return result;
    }
}