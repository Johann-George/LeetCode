class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        
        nums.sort()
        return nums[len(nums)-k]
        # k = len(nums) - k

        # def quickSelect(l,r):
        #     pivot,i=nums[r],l
        #     for j in range(l,r):
        #         if nums[j]<=pivot:
        #             nums[j],nums[i]=nums[i],nums[j]
        #             i+=1
        #     nums[r],nums[i]=nums[i],nums[r]

        #     if i>k: return quickSelect(l,i-1)
        #     elif i<k: return quickSelect(i+1,r)
        #     else: return nums[k]
        
        # return quickSelect(0,len(nums)-1)