class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        max_num=len(nums)
        nums_copy = nums[:]
        for i in range(max_num):
            nums[(i+k)%max_num]=nums_copy[i]

