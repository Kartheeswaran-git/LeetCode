// Last updated: 05/08/2026, 10:26:27
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n*2];
        int j=0;
        for(int i=0;i<n*2;i++)
        {
            arr[i]=nums[j];
            j++;
            if(j==n)
                j=0;
            
        }
        return arr;
    }
}