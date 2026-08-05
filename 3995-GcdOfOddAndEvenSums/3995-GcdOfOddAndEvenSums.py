# Last updated: 05/08/2026, 10:25:30
class Solution(object):
    def gcdOfOddEvenSums(self, n):
        odd=0
        even=0
        for i in range(n*2+1):
            if i%2==0:
                even+=i
            else:
                odd+=i
        m=min(odd,even)
        a=max(odd,even)
        while m!=0:
            t=m
            m=a%m
            a=t
        return a
        