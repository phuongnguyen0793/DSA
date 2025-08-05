class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroups = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        // Return all groups as a list
        return new ArrayList<>(anagramGroups.values());
        
    }
}