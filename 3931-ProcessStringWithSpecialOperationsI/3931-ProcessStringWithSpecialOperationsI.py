# Last updated: 05/08/2026, 10:25:27
class Solution(object):
    def processStr(self, s):
        r=""
        for i in range(0,len(s)):
            if s[i]=='*':
                r=r[:-1]
            elif s[i]=='#':
                r=r*2
            elif s[i]=='%':
                r=r[::-1]
            else:
                r+=s[i]
                
            
        return r
        










