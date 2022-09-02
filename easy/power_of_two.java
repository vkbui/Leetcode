class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n % 2 == 0) { // while divisible by 2 w no remainder
            n /= 2; // divide by 2
        }  
        return n == 1; // if 1, n is power of 2; else, false
    }
}