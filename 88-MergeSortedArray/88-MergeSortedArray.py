# Last updated: 05/08/2026, 10:32:02
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        j=0
        for i in range(m,m+n):
            nums1[i]=nums2[j]
            j+=1
        nums1.sort()
        return nums1
        