class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // sort each string by letters
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // key - sorted string by char; value - list of original strings
            // check if sorted string is in map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            // add original string to value
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}