// Last updated: 26/03/2026, 16:16:29
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(x+""))
            {
                l.add(i);
            }
        }   
        return l;
        
    }
}