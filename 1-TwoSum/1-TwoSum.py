# Last updated: 05/08/2026, 10:33:52
class Solution(object):
    def twoSum(self, arr, t):
        for i in range (0,len(arr)):
            for j in range(0,len(arr)):
                if(arr[i]+arr[j]==t and i!=j):
                    return [i,j]
        return
        
        