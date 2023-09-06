// 8/28/2023
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i += 1) {
            if (set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}

// 2022
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // sort in decreasing order - too long
//         // for (int i = 0; i < nums.length; i += 1) {
//         //     for (int j = i + 1; j < nums.length; j += 1) {
//         //         int temp = 0;
//         //         if (nums[i] > nums[j]) {
//         //             temp = nums[i];
//         //             nums[i] = nums[j];
//         //             nums[j] = temp;
//         //         }
//         //     }
//         // }
        
//         Arrays.sort(nums); // sorts to decreasing order
//         for (int i = 1; i < nums.length; i += 1) {
//             if (nums[i] == nums[i - 1]) { // compares values next to each other 
//                 return true; // if same, means duplicate
//             }
//         }
//         return false;
//     }
// }