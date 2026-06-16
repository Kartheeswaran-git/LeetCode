# Last updated: 16/06/2026, 08:54:07
1class Solution(object):
2    def trap(self, h):
3        l=0
4        r=len(h)-1
5        lmax=h[l]
6        rmax=h[r]
7        w=0
8        while l<r:
9            if(lmax<rmax):
10                l+=1
11                lmax=max(lmax,h[l])
12                w+=lmax-h[l]
13            else:
14                r-=1
15                rmax=max(rmax,h[r])
16                w+=rmax-h[r]
17        return w
18