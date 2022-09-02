class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1; // end of array 1
        int tail2 = n - 1; // end of array 2
        int end = m + n - 1; // at very end of nums1 w lengths of both arrays
        
        while (tail1 >= 0 && tail2 >= 0) { // start at ends of both arrays
            if (nums1[tail1] >= nums2[tail2]) { // compare elements; if tail1 element is greater
                nums1[end] = nums1[tail1]; // larger element gets put at end
                tail1 -= 1;
                end -= 1;
            }
            else {
                nums1[end] = nums2[tail2]; // if tail2 element is greater
                tail2 -= 1;
                end -= 1;
            }
        }
        
        while (tail2 >= 0) { // if remaining elements in tail2, add them
            nums1[end] = nums2[tail2];
            tail2 -= 1;
            end -= 1;
        }
    }
}