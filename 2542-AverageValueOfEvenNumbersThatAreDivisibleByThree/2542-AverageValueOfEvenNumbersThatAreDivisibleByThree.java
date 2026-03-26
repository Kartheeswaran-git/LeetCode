// Last updated: 26/03/2026, 16:17:03
class Solution {
    public int averageValue(int[] nums) {
        int sum=0,avg=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                sum+=nums[i];
                avg++;
            }
        }
        if(avg==1)
        return sum;
        else
        return sum/(avg-1);
    }
}