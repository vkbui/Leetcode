class Solution {
    public boolean canJump(int[] nums) {
        int maxLocation = 0;
        for(int i = 0; i < nums.length; i++){ // every num should be reachable
            if(i > maxLocation) { // if previous maxLocation smaller than i, meaning we cannot reach location i, return false
                return false;
            }
            maxLocation = Math.max(nums[i] + i, maxLocation); // gets the furthest location we can step
        }
        return true;
    }
}