class Solution {
    public int missingNumber(int[] nums) {
        int num = (nums.length*(nums.length + 1)) / 2; // get sum of numbers from 0 to n
        System.out.print(num);
        int total = 0;
        
        for (int number : nums) {
            total += number; // get the sum of the numbers in nums
        }
        
        num -= total; // subtract actual total from expected
        return num;
    }
}