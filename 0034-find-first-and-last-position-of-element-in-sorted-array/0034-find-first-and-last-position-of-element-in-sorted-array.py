class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        arr=[]
        l,r=0,len(nums)-1
        while l<len(nums) and nums[l]!=target :
            l+=1
        if l==len(nums):
            arr.append(-1)
        else: arr.append(l)
        while r>-1 and nums[r]!=target:
            r-=1
        if r==-1: arr.append(-1)
        else: arr.append(r)
        return arr
