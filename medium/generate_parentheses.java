class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) { // max * 2 bc pairs
            list.add(str);
            return;
        }
        
        if (open < max) { // continually add open parentheses
            backtrack(list, str + "(", open + 1, close, max);
        }
        
        if (close < open) { // once open parentheses finished, add the close parentheses
            backtrack(list, str + ")", open, close + 1, max);
        }
    }
    
    /*ex:
        (
        ((
        (((
        ((()
        ((())
        ((()))
        (()
        (()(
        (()()
        (()())
        (())
        (())(
        (())()
        ()
        ()(
        ()((
        ()(()
        ()(())
        ()()
        ()()(
        ()()()*/
}