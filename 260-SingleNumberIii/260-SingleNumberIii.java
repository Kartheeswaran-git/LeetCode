// Last updated: 26/03/2026, 16:20:54
class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(visited[i]) continue;

            for(int j = i + 1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    visited[i] = true;
                    visited[j] = true;
                    break;
                }
            }
        }

        int[] arr = new int[2];
        int k = 0;

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                arr[k++] = nums[i];
            }
        }

        return arr;
    }
}