class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charRecorderMap = new HashMap<Character, Integer>();
        int maxNonDuplicateSubstringLength = 0;
        int newSubstringStartPos = 0;

        // iterate through each char in s
        for (int currentPos = 0; currentPos < s.length(); currentPos += 1) {
            char theChar = s.charAt(currentPos);

            if (charRecorderMap.containsKey(theChar)) {
                // updates new substring start position to right of duplicated char
                newSubstringStartPos = Math.max(newSubstringStartPos, charRecorderMap.get(theChar) + 1);
            }

            // stores longest length
            maxNonDuplicateSubstringLength = Math.max(maxNonDuplicateSubstringLength, currentPos - newSubstringStartPos + 1);

            charRecorderMap.put(theChar, currentPos); // adds to map
        }

        return maxNonDuplicateSubstringLength;
        
// my way
//         int length = 0;
        
//         for (int i = 0; i < s.length(); i += 1) {
//             HashSet<Character> set = new HashSet<>();
            
//             int count = 0;
//             for (int j = i; j < s.length(); j += 1) {
//                 if (set.add(s.charAt(j)) == false) {
//                     break;
//                 }
//                 count += 1;
//             }
            
//             if (length < count) {
//                 length = count;
//             }
//         }
        
//         return length;
    }
}