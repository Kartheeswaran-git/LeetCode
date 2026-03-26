// Last updated: 26/03/2026, 16:18:15
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int prefix_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix_sum += nums[i];

            int remainder = prefix_sum % k;
            if (remainder < 0) {
                remainder += k;
            }

            if (map.containsKey(remainder)) {
                res += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return res;
    }
}