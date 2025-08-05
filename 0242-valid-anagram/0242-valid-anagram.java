class Solution {
    public boolean isAnagram(String s, String t) {
    int sLen = s.length(), tLen = t.length();
    if (sLen != tLen) {
      return false;
    }

    HashMap<Character, Integer> expectedCount = new HashMap<>();
    for (char c : s.toCharArray()) {
      expectedCount.put(c, expectedCount.getOrDefault(c, 0) + 1);
    }

    HashMap<Character, Integer> tCount = new HashMap<>();
    for (char c : t.toCharArray()) {
      tCount.put(c, tCount.getOrDefault(c, 0) + 1);
    }

    return expectedCount.equals(tCount);
  }
}