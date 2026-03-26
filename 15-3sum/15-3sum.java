// Last updated: 26/03/2026, 16:26:00
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        Set<List<Integer>> s = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            l = i + 1;
            r = n - 1;
            while (l < r) {
                List<Integer> li = new ArrayList<>();
                int temp = nums[i] + nums[l] + nums[r];
                if (temp == 0) {
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    s.add(li);
                    l++;
                    r--;
                } else if (temp < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new ArrayList<>(s);
    }
}