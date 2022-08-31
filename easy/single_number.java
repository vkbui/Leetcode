class Solution {
    public int singleNumber(int[] nums) {
// The ^ is a bitwise XOR operator. It works like this:
// 00010 ^ 00010 = 00000;
// 00000 ^ 10101 = 10101;
// In other words, if two integers of the same value (and bit representation) are XORed together, the expression evaluates to all 0s. If a number is XORed with all 0s, the expression evaluates to the number itself. These are both properties of the XOR function.
// XORing the entire array together will eliminate all the duplicates (they will all be set to 0) and leave only the single number.
        
        int result = 0;
        
        for (int num : nums) { // iterate through each num
            result ^= num; // XOR
        }
        
        return result;
        
// hashmap solution
//         Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
//         for (int num : nums) {
//             if (!myMap.containsKey(num)) {
//                 myMap.put(num, 1);
//             }
//             else {
//                 myMap.put(num, myMap.get(num) + 1);
//             }
//         }
        
//         for (int i = 0; i <= nums.length - 1; i += 1) {
//             if (myMap.get(nums[i]) == 1) {
//                 return nums[i];
//             }
//         }
        
//         return 0;
    }
}