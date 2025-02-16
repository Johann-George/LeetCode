class Solution:
    def canJump(self, nums: List[int]) -> bool:
        Sum=0
        if nums[Sum]==0:
            return True
        while Sum<=len(nums)-1:
            if nums[Sum]==0:
                temp=Sum
                while temp>=0 and nums[Sum]==0:
                    temp=temp-1
                    Sum=Sum-1
                    Sum=nums[Sum]+Sum
                    if temp<=0:
                        return False
            Sum=Sum+nums[Sum]
            if Sum>=len(nums)-1:
                return True
