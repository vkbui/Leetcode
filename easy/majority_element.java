class Solution {
    public int majorityElement(int[] nums) {
        // create integer map
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        int maj = 0;
        
        // goes through each element
        for (int num : nums) {
            if (!myMap.containsKey(num)) { // checks if key (num) exists. if not, add new key and value of 1
                myMap.put(num, 1);
            }
            else {
                myMap.put(num, myMap.get(num) + 1); // adds 1 to value if key exists
            }
            
            if (myMap.get(num) > nums.length / 2) { // checks if majority
                maj = num;
                break;
            }
        }
        
        return maj;
    }
}