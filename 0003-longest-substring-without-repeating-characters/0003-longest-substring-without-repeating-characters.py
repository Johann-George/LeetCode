class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l,r,output,flag=0,0,0,0
        x=""
        while l<=r and r<len(s):
            if s[r] not in x:
                x=s[l:r+1]
                print(x)
                flag=0
            else:
                output=max(output,len(x))
                l+=1
                x=s[l:r+1]
                if l==r:
                    r+=1
                flag=1
            if flag==0:
                r+=1
        output=max(output,len(x))
        return output