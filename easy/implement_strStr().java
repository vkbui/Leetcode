class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null) {
            return 0;
        }
        
        for (int i = 0; i < haystack.length(); i += 1) { // iterate through chars of haystack
            if (i + needle.length() > haystack.length()) { // not enough places after i for needle
                break;
            }
            
            for (int j = 0; j < needle.length(); j += 1) { // iterate through chars of needle
                if (haystack.charAt(i + j) != needle.charAt(j)) { // checks each char of needle if in haystack starting at i
                    break;
                }
                if (j == needle.length() - 1) { 
                    return i; // return if needle found
                }
            }
        }
        
        return -1;
        
        // built-in method
        // return haystack.indexOf(needle);
    }
}