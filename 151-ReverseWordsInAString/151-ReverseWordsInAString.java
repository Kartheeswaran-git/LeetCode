// Last updated: 05/08/2026, 10:31:03
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String o = "";
        for (int i = arr.length - 1; i > 0; i--) {
            o += arr[i] + " ";
        }
        return o + arr[0];
    }
}