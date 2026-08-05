// Last updated: 05/08/2026, 10:28:48
class Solution {
    public void reverseString(char[] arr) {
        int i=0;
        int n=arr.length-1;
        while(i<=n)
        {
            char temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }

    }
}