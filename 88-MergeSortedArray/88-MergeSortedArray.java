// Last updated: 26/03/2026, 16:23:21
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<nums1.length;i++)
        {
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}