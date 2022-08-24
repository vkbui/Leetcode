class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        
        // only one answer for 0,1,2
        if (n == 0){
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        steps[1] = 1; steps[2] = 2;
        
        // fibonacci sequence; adding two previous steps together
        // stores number of steps it takes to reach a number in n in an array
        for (int i = 3; i <= n; i += 1) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        
        return steps[n];
    }    
}