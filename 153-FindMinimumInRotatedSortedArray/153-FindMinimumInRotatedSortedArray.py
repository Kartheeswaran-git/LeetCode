# Last updated: 05/08/2026, 10:31:01
class Solution(object):
    def findMin(self, arr):
        l=0
        r=len(arr)-1
        while l<r:
            mid=l+(r-l)/2
            if arr[r]>arr[mid]:
                r=mid
            else:
                l=mid+1
        return arr[l]