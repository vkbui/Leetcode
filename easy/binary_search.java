class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while (low <= high) {
            mid = (low + high) / 2; // gets middle index
            
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
        return -1;
    }
}