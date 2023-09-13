class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // right pointer
        int ptr = numbers.length - 1;
        // left pointer
        for (int i = 0; i < numbers.length; i += 1) {
            // continually decrease right pointer until left + right is <= target
            while (numbers[i] + numbers[ptr] > target) {
                ptr -= 1;
            }
            if (numbers[i] + numbers[ptr] == target) {
                return new int[]{i + 1, ptr + 1};
            } 
        }
        return new int[2];
    }
}

