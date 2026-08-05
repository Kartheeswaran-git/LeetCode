# Last updated: 05/08/2026, 10:27:25
class Solution(object):
    def sortedSquares(self, nums):
        for i in range(len(nums)):
            nums[i]=nums[i]**2
        nums.sort()
        return nums
        