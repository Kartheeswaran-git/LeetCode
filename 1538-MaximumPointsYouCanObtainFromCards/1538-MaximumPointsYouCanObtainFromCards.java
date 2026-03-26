// Last updated: 26/03/2026, 16:17:52
class Solution {
    public int maxScore(int[] arr, int k) 
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int max=sum;
        int r=0;
        for(int i=1;i<k+1;i++)
        {
            sum-=arr[k-i];
            sum+=arr[arr.length-i];
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;

    }
}