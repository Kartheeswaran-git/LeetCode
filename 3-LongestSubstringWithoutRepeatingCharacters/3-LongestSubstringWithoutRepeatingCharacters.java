// Last updated: 26/03/2026, 16:26:34
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSize = 0;
        Set<Character> uniqueChars = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            if ((s.length() - j - 1) < longestSize) {
                break;
            }
            for (int i = j; i < s.length(); i++) {
                if (uniqueChars.add(s.charAt(i))) {
                    continue;
                } else {
                    break;
                }
            }
            if (uniqueChars.size() > longestSize) {
                longestSize = uniqueChars.size();
            }
            uniqueChars.clear();
        }
        return longestSize;
    }
}