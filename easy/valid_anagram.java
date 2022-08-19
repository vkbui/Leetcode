class Solution {
    public boolean isAnagram(String s, String t) {
        // checks if strings are same length
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = new char[s.length()];
        char[] tArray = new char[t.length()];
        
        
        // creates char arrays for each string
        for (int i = 0; i < s.length(); i += 1) {
            sArray[i] = s.charAt(i);
        }
        
        for (int i = 0; i < t.length(); i += 1) {
            tArray[i] = t.charAt(i);
        }
        
        
        int[] alphabet = new int[26]; // creates an int array w 26 elements
        for (int i = 0; i < sArray.length; i += 1) {
            // sArray[i] and tArray[i] are chars but when subtract 'a', becomes an int (ASCII), or index of alphabet
            // +1 and -1 will cancel if same amount of same char
            alphabet[sArray[i] - 'a'] += 1; // increments at specific index in alphabet
            alphabet[tArray[i] - 'a'] -= 1; // decrements at specific index in alphabet
        }
        
        for (int num : alphabet) { // checks each int in alphabet
            if (num != 0) { // not 0 means sArray and tArray chars did not cancel out
                return false;
            }
        }
        return true;
    }
}