// Last updated: 26/03/2026, 16:24:26
class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]== t)
            {
                return mid;
            }
            else if(nums[l]<=nums[mid])
            {
                if(nums[mid]>t && nums[l]<=t)
                {
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }

            }
            else 
            {
                if(nums[mid]<t && nums[r]>=t)
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }

            }
        }
        return -1;
    }
}