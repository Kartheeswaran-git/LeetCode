// Last updated: 26/03/2026, 16:17:50
class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int c=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
        }
        int max=c;
        
        for(int i=1;i<s.length()-k+1;i++)
        {
            char chh=s.charAt(i-1);
            char ch=s.charAt(i+k-1);
            if(chh=='a'||chh=='e'||chh=='i'||chh=='o'||chh=='u') c--;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') c++;
            if(c>max)
            max=c;
        }
        return max;
        
    }
}