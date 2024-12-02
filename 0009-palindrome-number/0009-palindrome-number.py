class Solution:
    def isPalindrome(self, x: int) -> bool:
        c=""
        s=str(x)
        for i in range(len(s)-1,-1,-1):
            c+=s[i]
        print(c)
        if c==s:
            return True
        return False