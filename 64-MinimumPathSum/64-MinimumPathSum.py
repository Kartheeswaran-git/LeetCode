# Last updated: 07/08/2026, 16:32:09
1class Solution(object):
2    def minPathSum(self, arr):
3        dp=arr
4        for i in range(1,len(dp[0])):
5            dp[0][i]+=dp[0][i-1]
6        for i in range(1,len(dp)):
7            dp[i][0]+=dp[i-1][0]
8        for i in range(1,len(dp)):
9            for j in range(1,len(dp[0])):
10                if dp[i][j]+dp[i-1][j]<dp[i][j]+dp[i][j-1]:
11                    dp[i][j]=dp[i][j]+dp[i-1][j]
12                else:
13                    dp[i][j]=dp[i][j]+dp[i][j-1]
14        print(dp)
15        return dp[len(dp)-1][len(dp[0])-1]
16        