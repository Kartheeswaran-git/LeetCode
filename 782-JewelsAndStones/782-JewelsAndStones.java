// Last updated: 26/03/2026, 16:18:37
class Solution {
    public int numJewelsInStones(String a, String b) {
        int sum=0;
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length();j++){
            if(a.charAt(i)==b.charAt(j))
            {
                sum++;
            }
            }
        }
        return sum;
            }
}