// Last updated: 02/06/2026, 10:07:05
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int maxC = 0;
        
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 1) 
            {
                c++;
            } 
            
            else 
            {
                maxC = Math.max(maxC, c);
                c = 0;
            }
        }

        return Math.max(maxC, c);
    }
}