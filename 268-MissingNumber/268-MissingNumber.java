// Last updated: 26/03/2026, 16:20:51
class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=0)
        return 0;
        int i;
        for (i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]!=1)
            return i+1;

        }
        return i+1;
    }
}