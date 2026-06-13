# Last updated: 13/06/2026, 12:22:22
1class Solution(object):
2    def runningSum(self, nums):
3        for i in range(0,len(nums)-1):
4            nums[i+1]+=nums[i]
5        return nums
6        