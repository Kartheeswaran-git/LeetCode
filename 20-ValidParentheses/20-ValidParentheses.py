# Last updated: 05/08/2026, 10:33:28
class Solution(object):
    def isValid(self, s):
        st = []

        for i in s:
            if i == "(" or i == "[" or i == "{":
                st.append(i)
            else:

                if not st:
                    return False
                if (i == ")" and st.pop() != "(") or \
                   (i == "]" and st.pop() != "[") or \
                   (i == "}" and st.pop() != "{"):
                    return False

        return len(st) == 0