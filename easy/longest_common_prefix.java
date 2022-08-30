class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) { // iterate through each string
            while(strs[i].startsWith(prefix) == false) { // if string doesn't start with prefix 
                prefix = prefix.substring(0, prefix.length()-1); // decrease prefix by one letter and loop again to check if it starts with; this gets lowest prefix
            }
        }
        return prefix;
    }
}