class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] sArray = s.toCharArray(); // converts string to char array
	    for (char c : sArray) { // checks each char in sArray
            if (c == '(') {
                stack.push(')'); // pushes opposite to the stack
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (c == '{') {
                stack.push('}');
            }
            // checks if current char is the opposite of the last c (if pop = opposite)
            else if (stack.isEmpty() == true || stack.pop() != c) {
                return false;
            }       
        }
        return stack.isEmpty(); // should be empty if stack completely popped
    }
}