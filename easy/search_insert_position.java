class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while (low < high) {
            mid = low + (high - low) / 2; // gets middle index; same as (high + low) but this causes arithmetic overflow when both numbers are too large
            
            if (target == nums[mid]){
                return mid; // checks if target is element at mid
            }
                
            if (target < nums[mid]) {
                high = mid - 1; // moves high to 1 below mid (gets lower half of array)
            }
            else {
                low = mid + 1; // moves low to 1 above mid (gets upper half of array)
            }
        }
        
        if (nums[low] < target) {
            return low + 1; // insert to right of low
        }
        else {
            return low; // insert to left of low
        }
        
        
        // O(n)
        // for (int i = 0; i < nums.length; i += 1) { // iterate through each num
        //     if (nums[i] == target) { // target found
        //         return i;
        //     }
        //     else if (nums[i] > target) { // target not found and num is in middle of array; return index before number that is immediately greater
        //         return i;
        //     }
        // }
        // return nums.length; // target not found and num is at end
    }
}