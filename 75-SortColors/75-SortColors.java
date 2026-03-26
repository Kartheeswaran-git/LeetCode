// Last updated: 26/03/2026, 16:23:38
class Solution {
    public void sortColors(int[] nums) {
        int o = 0;
        int z = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                z++;
            if (nums[i] == 1)
                o++;
        }
        System.out.print(z);
        for (int i = 0; i < n; i++) {
            if (i < z)
                nums[i] = 0;
            else if (i <z + o)
                nums[i] = 1;
            else
                nums[i] = 2;
        }

    }
}