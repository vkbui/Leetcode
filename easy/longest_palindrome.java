class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }
        
        char[] sArray = new char[s.length()];
        
        // turns s to char array
        for (int i = 0; i < s.length(); i += 1) {
            sArray[i] = s.charAt(i);
        }
        
        // counts how many of each character
        int[] alphabet = new int[128];
        for (int i = 0; i < sArray.length; i += 1) {
            alphabet[sArray[i]] += 1;
        }
        
        // counts number of chars w odd amount
        int single = 0;
        for (int num : alphabet) {
            if (num % 2 != 0) {
                single += 1;
            }
        }
        
        if (single > 1) {
            return s.length() - single + 1; // + 1 to include as one char middle char of palindrome
        }
        return s.length();
    }
}