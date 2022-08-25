class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        
        // iterate through all intervals
        for (int[] interval : intervals) {
            // if newInterval is before interval, insert newInterval and update interval as new interval to continue loop and build rest of result
            if (newInterval[1] < interval[0]) {
                result.add(newInterval);
                newInterval = interval; 
            }
            // if newInterval is after interval, add interval
            else if (newInterval[0] > interval[1]) {
                result.add(interval);
            }
            // overlap; update lowest of start and highest of end
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        
        // add last newInterval
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}