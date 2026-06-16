# Last updated: 16/06/2026, 18:22:44
1class Solution(object):
2    def singleNumber(self, nums):
3        nums.sort()
4        for i in range(0,len(nums)-1,2):
5            if nums[i]!=nums[i+1]:
6                return nums[i]
7        return nums[len(nums)-1]
8
9        