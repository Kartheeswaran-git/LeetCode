// Last updated: 26/03/2026, 16:24:58
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
                
            }
        }
        return ++j;
    }
}