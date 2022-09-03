class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 4 == 0) { // while divisible by 4 w no remainder
            n /= 4; // divide by 4
        }  
        return n == 1; // if 1, n is power of 4; else, false
    }
}