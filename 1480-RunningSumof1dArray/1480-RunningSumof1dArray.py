# Last updated: 13/06/2026, 12:36:38
1class Solution(object):
2    def fizzBuzz(self, n):
3        a=[]
4        for i in range(1,n+1):
5            if(i%3==0 and i%5==0):
6                a.append("FizzBuzz")
7            elif(i%3==0):
8                a.append("Fizz")
9            elif(i%5==0):
10                a.append("Buzz")
11            else:
12                a.append(str(i))
13        return a