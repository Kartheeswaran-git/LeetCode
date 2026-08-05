# Last updated: 05/08/2026, 10:29:16
class Solution(object):
    def moveZeroes(self, nums):
        j = 0
        for i in range(0, len(nums)):
            if nums[i] != 0:
                t = nums[i]
                nums[i] = nums[j]
                nums[j] = t
                j += 1