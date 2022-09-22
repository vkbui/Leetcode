class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        
        for (int n : nums) {
            if (i == 0 || n != nums[i-1]) { // checks if current num doesnt equal num at prev index
                nums[i] = n; // replace num at i with n
                i += 1; // only increase index when you see a unique num
            }
        }
        
        return i;
    }
}