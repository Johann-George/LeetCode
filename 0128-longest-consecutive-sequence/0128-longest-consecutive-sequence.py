class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        arr=set(nums)
        longest=0
        for n in arr:
            if (n-1) not in arr:
                length=0
                while (n+length) in arr:
                    length+=1
                longest=max(length,longest)
        return longest