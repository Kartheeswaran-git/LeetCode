# Last updated: 05/08/2026, 10:29:24
class Solution(object):
    def isAnagram(self, s, t):
        return(sorted(s)==sorted(t))