# Last updated: 10/08/2026, 13:53:32
1class Solution(object):
2    def checkRecord(self, s):
3        a=0
4        for i in s:
5            if i=='A':
6                a+=1
7        if a>=2 or "LLL" in s:
8            return False
9        return True
10        