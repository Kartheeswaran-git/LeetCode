// Last updated: 26/03/2026, 16:18:01
class Solution {
    public int minCostToMoveChips(int[] p) {
        int o=0,e=0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]%2==0)
            e++;
            else
            o++;
        }
        return Math.min(e,o);
    }
}