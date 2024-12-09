class Solution:
    def isPalindrome(self, s: str) -> bool:
        strs=""
        strs_rev=""
        for c in s:
            if c.isalpha():
                strs+=c.lower()
            elif c.isdigit():
                strs+=c
        n=int(len(strs)/2)
        for i in range (n-1,-1,-1):
            strs_rev+=strs[i]
        if len(strs)%2==0:
            if strs_rev==strs[n:]:
                return True
            return False
        else:
            if strs_rev==strs[n+1:]:
                return True
            return False
