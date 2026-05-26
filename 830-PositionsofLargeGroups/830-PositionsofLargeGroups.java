// Last updated: 26/05/2026, 15:25:00
1class Solution {
2
3    public List<List<Integer>> largeGroupPositions(String s) {
4
5        List<List<Integer>> result = new ArrayList<>();
6
7        int p1 = 0;
8        int p2 = 0;
9
10        while(p2 < s.length()){
11
12            while(p2 < s.length() &&
13                  s.charAt(p1) == s.charAt(p2)){
14
15                p2++;
16            }
17
18            int length = p2 - p1;
19
20            if(length >= 3){
21
22                List<Integer> temp = new ArrayList<>();
23
24                temp.add(p1);
25                temp.add(p2 - 1);
26
27                result.add(temp);
28            }
29
30            p1 = p2;
31        }
32
33        return result;
34    }
35}