class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i += 1) { // iterate through each num
            if (nums[i] == target) { // target found
                return i;
            }
            else if (nums[i] > target) { // target not found and num is in middle of array; return index before number that is immediately greater
                return i;
            }
        }
        return nums.length; // target not found and num is at end
    }
}