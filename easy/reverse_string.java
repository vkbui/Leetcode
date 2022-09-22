class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i += 1) { // pointer at each end moving toward center
            // swap chars
            char temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
    }
}