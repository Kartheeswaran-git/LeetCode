# Last updated: 16/06/2026, 09:32:43
1class Solution(object):
2    def processStr(self, s):
3        r=""
4        for i in range(0,len(s)):
5            if s[i]=='*':
6                r=r[:-1]
7            elif s[i]=='#':
8                r=r*2
9            elif s[i]=='%':
10                r=r[::-1]
11            else:
12                r+=s[i]
13                
14            
15        return r
16        
17
18
19
20
21
22
23
24
25
26
27