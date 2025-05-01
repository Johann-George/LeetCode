class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        l=r=0
        sum0,temp=float('-inf'),0
        while(l<=r and r<len(nums)):
            if l==r:
                sum0=max(sum0,nums[l])
                temp=nums[l]
            else:
                temp=temp+nums[r]
                sum0=max(temp,sum0)
                if temp<=0 and temp<=sum0:
                    temp-= (nums[l]+nums[r])
                    l+=1
                    continue
            r+=1
        return sum0
