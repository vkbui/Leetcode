class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // add all nums to a set
        for (int i : nums) {
            set.add(i);
        }

        int max = 0;
        for (int i : nums) {
            // check if i has a number before it; if not, it is the first of a sequence
            if (!set.contains(i - 1)) {
                int tempMax = 1;
                // track how long that sequence is
                while (set.contains(i + 1)) {
                    tempMax += 1;
                    i += 1;
                }
                // update max
                if (tempMax > max) {
                    max = tempMax;
                }
            }
            // optimization; if sequence longer than half of nums, no longer sequence can exist
            if (max > nums.length/2) {
                break;
            }
        }

        return max;
    }
}