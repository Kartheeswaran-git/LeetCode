# Last updated: 05/08/2026, 10:33:13
class Solution(object):
    def removeElement(self, nums, val):
        while val in nums:
            nums.remove(val)