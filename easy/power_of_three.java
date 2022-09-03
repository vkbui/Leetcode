class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 3 == 0) { // while divisible by 3 w no remainder
            n /= 3; // divide by 3
        }
        return n == 1; // if 1, n is power of 3; else, false
    }
}