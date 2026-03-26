// Last updated: 26/03/2026, 16:22:10
class Solution {
    public int singleNumber(int[] nums) {
        
       int res=0;
      for(int i=0;i<nums.length;i++)
      {
        res=res^nums[i];
      }  
      return res;
    }
}