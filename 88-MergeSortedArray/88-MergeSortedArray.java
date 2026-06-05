// Last updated: 06/06/2026, 00:39:03
1class Solution {
2    public int strStr(String a, String b) {
3        for(int i = 0, j = b.length(); j<=a.length(); i++,j++){
4            if(a.substring(i,j).equals(b)){
5                return i;
6            }
7        }
8        return -1;
9    }
10}