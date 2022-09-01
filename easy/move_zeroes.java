class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i += 1) { // curr pointer
            for (int j = i; j <= nums.length - 1; j += 1) { // next pointer
                if (nums[j] != 0 && nums[i] == 0) { // if curr is zero and next is non zero, swap
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;
                }
            }
        }
    }
}