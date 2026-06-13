# Last updated: 13/06/2026, 12:26:26
1class Solution(object):
2    def maximumWealth(self, a):
3        max=0
4        for i in range(0,len(a)):
5            sum=0
6            for j in range(0,len(a[i])):
7                sum+=a[i][j]
8            if max<sum:
9                max=sum
10        return max
11
12        