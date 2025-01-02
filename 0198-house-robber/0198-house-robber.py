class Solution:
    def rob(self, nums: List[int]) -> int:
        sum_even,sum_odd=0,0
        for i in range(len(nums)):
            if (i%2)==0:
                sum_even+=nums[i]
            else:
                sum_odd+=nums[i]
        sum_max=max(sum_even,sum_odd)
        return sum_max