// Last updated: 26/03/2026, 16:26:17
class Solution {
    public String longestCommonPrefix(String[] arr) {
        String x="";
        Arrays.sort(arr);
        String a=arr[0];
        String b=arr[arr.length-1];
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                x+=a.charAt(i);
            }
            else
            break;
        }
        return x;
    }
}