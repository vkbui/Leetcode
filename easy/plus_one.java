class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i -= 1) { // start from last digit
            if (digits[i] < 9) { // if less than 9, means no carry; add 1
                digits[i] += 1;
                return digits; 
            }
            digits[i] = 0; // else, make 0 and loop again to find digit that is less than 9 to increase by 1
        }
        
        // if all digits are 9, need to make new array that is 1 longer
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}