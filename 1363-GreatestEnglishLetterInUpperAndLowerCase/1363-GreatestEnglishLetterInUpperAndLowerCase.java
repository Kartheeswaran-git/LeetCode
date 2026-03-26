// Last updated: 26/03/2026, 16:18:00
class Solution {
    public String greatestLetter(String s) {
        char a='z';
        char b='Z';
        for(int i=0;i<=27;i++)
        {
            if(s.contains(a+"") && s.contains(b+""))
            return b+"";
            a-=1;
            b-=1;
        }
        return "";
    }
}