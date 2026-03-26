// Last updated: 26/03/2026, 16:17:54
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum =0,c=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int max=k*threshold;
        if(sum>=max)
        {
            c++;
        }
        for(int i=1;i<arr.length-k+1;i++)
        {

            sum -=arr[i-1];
            sum+=arr[i+k-1];
            if(sum>=max)
            {
                c++;
            }
        }
        return c;
    }
}