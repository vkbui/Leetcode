class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] sArray = s.toCharArray(); // turn str to char array
        
        for (int i = 0; i <= sArray.length - 1; i += 1) { // iterate through each char
            if (sArray[i] == 'M') {
                result += 1000;
            }
            else if (sArray[i] == 'D') {
                result += 500;
            }
            else if (sArray[i] == 'C') {
                if (i == sArray.length - 1) {
                    result += 100;
                }
                else if (sArray[i + 1] == 'D') { // check char after
                    result += 400;
                    i += 1; // skip the char after
                }
                else if (sArray[i + 1] == 'M') { // same as above
                    result += 900;
                    i += 1;
                }
                else {
                    result += 100;
                }
            }
            else if (sArray[i] == 'L') {
                result += 50;
            }
            else if (sArray[i] == 'X') {
                if (i == sArray.length - 1) {
                    result += 10;
                }
                else if (sArray[i + 1] == 'L') {
                    result += 40;
                    i += 1;
                }
                else if (sArray[i + 1] == 'C') {
                    result += 90;
                    i += 1;
                }
                else {
                    result += 10;
                }
            }
            else if (sArray[i] == 'V') {
                result += 5;
            }
            else {
                if (i == sArray.length - 1) {
                    result += 1;
                }
                else if (sArray[i + 1] == 'V') {
                    result += 4;
                    i += 1;
                }
                else if (sArray[i + 1] == 'X') {
                    result += 9;
                    i += 1;
                }
                else {
                    result += 1;
                }
            }
        }
        return result;
    }
}