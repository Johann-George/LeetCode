class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        
        def binarySearch(nums,target,leftBias):
            l,r,i=0,len(nums)-1,-1
            while l<=r:
                m=(l+r)//2
                if target>nums[m]:
                    l=m+1
                elif target<nums[m]:
                    r=m-1
                else:
                    i=m
                    if leftBias:
                        r=m-1
                    else:
                        l=m+1
            return i
            
        left=binarySearch(nums,target,True)
        right=binarySearch(nums,target,False)
        return [left,right]