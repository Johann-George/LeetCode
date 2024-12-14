class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        Sum,max_sum=0,nums[0]
        for num in nums:
            if Sum<0:
                Sum=0
            Sum+=num
            max_sum=max(max_sum,Sum)
        return max_sum
    
