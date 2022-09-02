class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < numRows; i += 1) { // iterate to each row
            List<Integer> row = new ArrayList<Integer>(); 
            
            for (int j = 0; j <= i; j += 1) { // iterate through each row
                if (j == 0 || j == i) { // if first or last element of row, add 1
                    row.add(1);
                }
                else {
                    int a = result.get(i - 1).get(j - 1); // gets prev row's left num
                    int b = result.get(i - 1).get(j); // gets prev row's right num
                    row.add(a + b); // add them
                }
            }
            result.add(row); // add the row to the main list
        }
        return result;
    }
}