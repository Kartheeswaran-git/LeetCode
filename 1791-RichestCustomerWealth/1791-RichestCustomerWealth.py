# Last updated: 05/08/2026, 10:26:44
class Solution(object):
    def maximumWealth(self, a):
        max=0
        for i in range(0,len(a)):
            sum=0
            for j in range(0,len(a[i])):
                sum+=a[i][j]
            if max<sum:
                max=sum
        return max

        