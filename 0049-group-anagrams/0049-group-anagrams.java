class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroups = new HashMap<>();
    
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);            
            anagramGroups.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(anagramGroups.values());
    }
}