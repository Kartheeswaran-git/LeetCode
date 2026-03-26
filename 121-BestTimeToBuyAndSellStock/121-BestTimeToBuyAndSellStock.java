// Last updated: 26/03/2026, 16:22:25
class Solution {
    public int maxProfit(int[] arr) {
        int p=0;
        int b=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<b)
                b=arr[i];
            else if(arr[i]-b>p)
                p=arr[i]-b;
        }
        return p;
    }
}