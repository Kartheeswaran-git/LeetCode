# Last updated: 10/08/2026, 14:50:38
1class Solution(object):
2    def heightChecker(self, h):
3        arr=[]
4        for i in h:
5            arr.append(i)
6        arr.sort()
7        c=0
8        for i in range(len(h)):
9            if h[i] != arr[i]:
10                c+=1 
11        return c
12        