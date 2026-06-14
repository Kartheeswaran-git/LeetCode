// Last updated: 14/06/2026, 22:40:29
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3
4        int map1[] = new int[200];
5        int map2[] = new int[200];
6        if (s.length() != t.length())
7            return false;
8        for (int i = 0; i < s.length(); i++) {
9            if (map1[s.charAt(i)] != map2[t.charAt(i)])
10                return false;
11            map1[s.charAt(i)] = i + 1;
12            map2[t.charAt(i)] = i + 1;
13        }
14        return true;
15    }
16}