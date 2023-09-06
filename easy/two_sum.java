// 9/1/2023
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i += 1) {
            if (map.containsKey(nums[i])) { // check if complement exists and get its index
                return new int[] {i, map.get(nums[i])};
            }
            else {
                map.put(target - nums[i], i); // store (complement, index) pair
            }
        }
        return null;
    }
}

// 2022
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i += 1) { // goes through each element
//             for (int j = i + 1; j < nums.length; j += 1) { // goes through each element after i
//                 if (nums[i] + nums[j] == target) { // checks if element at i + element at j = target
//                     return new int[] {i,j}; // creates new int array to return solution
//                 }
//             }
//         }
//         return null;
//     }
// }