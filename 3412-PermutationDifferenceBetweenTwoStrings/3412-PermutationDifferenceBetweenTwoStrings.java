// Last updated: 26/03/2026, 16:16:21
class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    if(i-j<0)
                    sum+=j-i;
                    else
                    sum+=i-j;
                }
            }
        }
        return sum;
    }
}