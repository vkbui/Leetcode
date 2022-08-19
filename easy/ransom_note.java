class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // checks of ransomNote is longer than magazine
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
    
        char[] rArray = new char[ransomNote.length()];
        char[] mArray = new char[magazine.length()];
        
        // creates char arrays for each string
        for (int i = 0; i < ransomNote.length(); i += 1) {
            rArray[i] = ransomNote.charAt(i);
        }
        
        for (int i = 0; i < magazine.length(); i += 1) {
            mArray[i] = magazine.charAt(i);
        }
        
        int[] alphabet = new int[26]; // creates an int array w 26 elements
        // counts how many of each char in magazine
        for (int i = 0; i < mArray.length; i += 1) {
            // mArray are chars but when subtract 'a', becomes an int (ASCII), or index of alphabet
            // +1 and -1 will cancel if same amount of same char
            alphabet[mArray[i] - 'a'] += 1; // increments at specific index in alphabet
        }
        
        // counts how many of each char in ransomNote
        for (int i = 0; i < rArray.length; i += 1) {
            alphabet[rArray[i] - 'a'] -= 1; // decrements at specific index in alphabet
            if (alphabet[rArray[i] - 'a'] < 0) { // if more of one character is in ransomNote than magazine
                return false;
            }
        }
        return true;

// very slow method
//         int count = 0;
//         for (int i = 0; i < rArray.length; i += 1) {
//             for (int j = 0; j < mArray.length; j += 1) {
//                 if (rArray[i] == mArray[j]) {
//                     for (int k = j; k < mArray.length - 1; k += 1) {
//                         mArray[k] = mArray[k + 1];
//                     }
//                     count += 1;
//                     break;
//                 }
//             }
//         }
        
//         if (count == ransomNote.length()) {
//             return true;
//         }
//         return false;
    }
}