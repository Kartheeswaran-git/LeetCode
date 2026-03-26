// Last updated: 26/03/2026, 16:22:19
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9\\s]", "");
        s=s.toLowerCase();
        char[] ch=s.toCharArray();
        for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
        {   
            while((ch[i]+"").equals(" "))
            i++;
            while((ch[j]+"").equals(" "))
            j--;
            if(ch[i]==ch[j])
                continue;
            return false;
        }
        return true;
        
    }
}