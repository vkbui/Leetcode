class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i += 1) { // goes through each element
            for (int j = i + 1; j < nums.length; j += 1) { // goes through each element after i
                if (nums[i] + nums[j] == target) { // checks if element at i + element at j = target
                    return new int[] {i,j}; // creates new int array to return solution
                }
            }
        }
        return null;
    }
}