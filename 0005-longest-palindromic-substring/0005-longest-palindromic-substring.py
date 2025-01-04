class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s)==1:
            return s
        longStr=""
        def palindrome(l,r,longStr):
            while l>=0 and r<len(s) and s[l]==s[r]:
                if len(longStr)<len(s[l:r+1]):
                    longStr=s[l:r+1]
                l-=1
                r+=1
            return longStr
        for i in range(0,len(s)):
            l,r=i,i
            longStr=palindrome(l,r,longStr)

            l,r=i,i+1
            longStr=palindrome(l,r,longStr)

        
        return longStr
    