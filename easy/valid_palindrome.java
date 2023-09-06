// 9/1/2023
class Solution {
    public boolean isPalindrome(String s) {   
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char front = s.charAt(i);
            char back = s.charAt(j);

            // move to next element if not letter or digit
            if (!Character.isLetterOrDigit(front)) {
                i += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(back)) {
                j -= 1;
                continue;
            }

            // only runs when both point to letter/digit elements
            if (Character.toLowerCase(front) != Character.toLowerCase(back)) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
}

// 2022
// class Solution {
//     public boolean isPalindrome(String s) {
//         String newS = s.replaceAll("[^a-zA-Z0-9]", ""); // removes all non-alphanumeric chars
//         newS = newS.toLowerCase(); // sets chars to lowercase
//         char[] newArray = new char[newS.length()]; // creates new array to fill in w newS chars
        
//         // makes newS to char array
//         for (int i = 0; i < newS.length(); i += 1) {
//             newArray[i] = newS.charAt(i);
//         }
        
//         // compares first and last elements and increments towards middle of char array
//         for (int i = 0; i < newArray.length / 2; i += 1) {
//             if (newArray[i] != newArray[newArray.length - i - 1]) { // checks if not matching
//                 return false;
//             }
//         }
//         return true;
//     }
// }