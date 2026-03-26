// Last updated: 26/03/2026, 16:17:49
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int [nums.length];
        int k=0;
    for(int i=0,j=n;i<n && j<nums.length;j++,i++)
    {
     arr[k]=nums[i];
     arr[++k]=nums[j];
     ++k;   
    }    
    return arr;
    }
}