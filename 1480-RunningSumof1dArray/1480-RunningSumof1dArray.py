# Last updated: 13/06/2026, 14:04:05
1class Solution(object):
2    def isAnagram(self, s, t):
3        return(sorted(s)==sorted(t))