# Last updated: 05/08/2026, 10:26:51
class Solution(object):
    def runningSum(self, nums):
        for i in range(0,len(nums)-1):
            nums[i+1]+=nums[i]
        return nums
        