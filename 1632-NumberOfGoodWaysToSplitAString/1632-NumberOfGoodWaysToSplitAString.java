// Last updated: 26/03/2026, 16:17:46
class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] l = new int[n];
        int[] r = new int[n];
        Set<Character> ls = new HashSet<>();
        Set<Character> rs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            ls.add(s.charAt(i));
            l[i] = ls.size();
        }
        for (int i = 0; i < n; i++) {
            rs.add(s.charAt(n - 1 - i));
            r[n - 1 - i] = rs.size();
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (l[i] == r[i + 1]) {
                ans++;
            }
        }
        return ans;
    }
}