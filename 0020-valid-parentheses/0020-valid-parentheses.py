class Solution:
    def isValid(self, s: str) -> bool:
        closeToOpen={")":"(","]":"[","}":"{"}
        stack=[]
        for c in s:
            if c in ["(","[","{"]:
                stack.append(c)
            else:
                if stack:
                    i=stack.pop()
                    if closeToOpen[c]!=i:
                        return False
                else:
                    return False
        if stack:
            return False
        return True