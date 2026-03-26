// Last updated: 26/03/2026, 16:24:01
class Solution {
    public int lengthOfLastWord(String s) {
        if (!s.contains(" ")) {
            return s.length();
        }
        String[] sArray = s.split(" ");
        return sArray[(sArray.length)-1].length();
    }
}