// 9/13/2023
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            // get max volume and iterate shorter pointer
            if (height[left] > height[right]) {
                max = Math.max(max, height[right] * (right - left));
                right -= 1;
            }
            else {
                max = Math.max(max, height[left] * (right - left));
                left += 1;
            }
        }

        return max;
    }
}

// 2022
// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0;
//         int right = height.length - 1;
//         int max = 0;
        
//         while (left < right) {
//             if (Math.min(height[left], height[right]) * (right - left) > max) { // check if area is greater than max
//                 max = Math.min(height[left], height[right]) * (right - left); // update max w greater area
//             }
//             else if (height[left] > height[right]) { // increment lower height towards middle
//                 right -= 1;
//             }
//             else {
//                 left += 1;
//             }
//         }
        
//         return max;
//     }
// }