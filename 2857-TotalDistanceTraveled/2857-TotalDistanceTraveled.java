// Last updated: 26/03/2026, 16:16:36
class Solution {
    public int distanceTraveled(int m, int a) {
        int d=0;
        while (m!=0)
        {
            if(m-5>=0 && a>0){
                d+=5;
                m-=4;
                a--;
            }
            else
            {
                d+=m;
                m=0;
            }
        }
        return d*10;
    }
}