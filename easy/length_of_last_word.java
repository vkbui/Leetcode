class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" "); // split string by spaces into array
        return words[words.length - 1].length(); // return length of last word in array
    }
}