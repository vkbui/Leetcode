class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        char[] nums = num.toCharArray(); // convert to char array
        
        if (nums[0] == '-') {
            return false;
        }
        
        // compares first and last elements and increments towards middle of char array
        for (int i = 0; i < nums.length / 2; i += 1) {
            if (nums[i] != nums[nums.length - i - 1]) { // checks if not matching
                return false;
            }
        }
        return true;
    }
}