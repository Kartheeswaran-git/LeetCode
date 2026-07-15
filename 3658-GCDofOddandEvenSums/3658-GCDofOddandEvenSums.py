# Last updated: 15/07/2026, 09:15:08
1class Solution(object):
2    def gcdOfOddEvenSums(self, n):
3        odd=0
4        even=0
5        for i in range(n*2+1):
6            if i%2==0:
7                even+=i
8            else:
9                odd+=i
10        m=min(odd,even)
11        a=max(odd,even)
12        while m!=0:
13            t=m
14            m=a%m
15            a=t
16        return a
17        