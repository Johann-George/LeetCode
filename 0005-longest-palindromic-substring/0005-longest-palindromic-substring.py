class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s)==1:
            return s
        longStr=""
        for l in range(0,len(s)-1):
            r=l
            while l<=r and r<len(s):
                if self.palindrome(s[l:r+1]):
                    if len(longStr)<len(s[l:r+1]):
                        longStr=s[l:r+1]
                r+=1
        return longStr
    def palindrome(self,s):
        return s==s[::-1]