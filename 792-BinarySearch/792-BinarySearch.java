// Last updated: 26/03/2026, 16:18:34
class Solution {
    public int search(int[] arr, int t) {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(t==arr[mid])
            {
                return mid;
            }
            else if(t<arr[mid])
            {
                r=mid-1;
            }
            else 
            {
                l=mid+1;
            }
        }
        return -1;
    }
}