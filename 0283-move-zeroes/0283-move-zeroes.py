class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        l,r=0,1
        while l<=r and r<len(nums):
            while nums[l]!=0 and l<len(nums):
                l+=1
                if l==len(nums):
                    break
            r=l
            if r>=len(nums):
                break
            while nums[r]==0 and r<len(nums):
                r+=1
                if r==len(nums):
                    break
            if r<len(nums) and l<len(nums):
                nums[l],nums[r]=nums[r],nums[l]
    
            
        