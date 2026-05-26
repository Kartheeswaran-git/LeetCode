// Last updated: 26/05/2026, 16:06:59
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> res = new ArrayList<>();
4
5        for (int i = 1; i <= n; i++) {
6            if (i % 15 == 0) {
7                res.add("FizzBuzz");
8            } else if (i % 3 == 0) {
9                res.add("Fizz");
10            } else if (i % 5 == 0) {
11                res.add("Buzz");
12            } else {
13                res.add(String.valueOf(i));
14            }
15        }
16
17        return res;        
18    }
19}