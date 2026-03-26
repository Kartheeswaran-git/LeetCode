// Last updated: 26/03/2026, 16:21:20
class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            while(sum>=t)
            {
                if(min>i-l+1)
                  min=i-l+1;
                sum-=arr[l];
                l++;
            }
            
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        return min;
    }
}