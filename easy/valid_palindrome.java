class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", ""); // removes all non-alphanumeric chars
        newS = newS.toLowerCase(); // sets chars to lowercase
        char[] newArray = new char[newS.length()]; // creates new array to fill in w newS chars
        
        // makes newS to char array
        for (int i = 0; i < newS.length(); i += 1) {
            newArray[i] = newS.charAt(i);
        }
        
        // compares first and last elements and increments towards middle of char array
        for (int i = 0; i < newArray.length / 2; i += 1) {
            if (newArray[i] != newArray[newArray.length - i - 1]) { // checks if not matching
                return false;
            }
        }
        return true;
    }
}