// Last updated: 26/03/2026, 16:19:23
class Solution {
    public int subarraySum(int[] nums, int k) {      
        int count = 0,sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum  = sum+nums[i]; // 1
            count = count + map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}