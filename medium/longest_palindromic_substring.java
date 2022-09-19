class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i += 1) {
            char c = s.charAt(i);
            int left = i;
            int right = i;
            
            // moves left and right to end of substring of same char
            // ex: abbba; if i = 2, left moves to i = 1 and right moves to i = 3
            // ex: abba; if i = 2, left moves to i = 1 and right does not move
            while (left >= 0 && s.charAt(left) == c) {
                left -= 1;
            }
            
            while (right < s.length() && s.charAt(right) == c) {
                right += 1;
            }
            
            // increment left and right to longest palindromes
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                
                left -= 1;
                right += 1;
            }
            
            left += 1; // get start index of palindrome
            // checks if length of curr palindrome is longer than stored palindrome
            if (end - start < right - left) { 
                start = left;
                end = right;
            }
        }
        
        return s.substring(start, end);
    }
}