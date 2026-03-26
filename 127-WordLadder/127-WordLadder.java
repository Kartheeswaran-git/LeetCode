// Last updated: 26/03/2026, 16:22:15
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean flag = false;
        int length = beginWord.length();

        for(String s: wordList){
            if(s.equals(endWord)){
                flag = true;
                break;
            }
        }
        if(!flag) return 0;

        wordList.add(0, beginWord);

        int endIndex = -1;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(endWord)) {
                endIndex = i;
                break;
            }
        }

        List<List<Integer>> adj = new ArrayList<>(wordList.size());
        for(int i = 0; i < wordList.size(); i++) adj.add(new ArrayList<>());

        for(int i = 0; i < wordList.size(); i++){
            for(int j = i+1; j < wordList.size(); j++){
                int diff = 0;
                int charcount = 0;
                while(charcount < length && diff <=1){
                    if(wordList.get(i).charAt(charcount) !=
                       wordList.get(j).charAt(charcount)) diff++;
                    charcount++;
                }
                if(diff == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[wordList.size()];
        Arrays.fill(dist, (int)1e6);
        dist[0] = 0;
        queue.add(0);

        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v: adj.get(u)){
                if(1 + dist[u] < dist[v]) {
                    dist[v] = 1 + dist[u];
                    queue.add(v);
                }
            }
        }

        return dist[endIndex] == (int)1e6 ? 0 : dist[endIndex] + 1;
    }
}