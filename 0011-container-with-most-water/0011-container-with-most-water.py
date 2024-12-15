class Solution:
    def maxArea(self, height: List[int]) -> int:
        area=0
        l=0
        r=len(height)-1
        while l<r:
            length=min(height[l],height[r])
            area=max(area,length*(r-l))
            if length==height[l]:
                l+=1
            else:
                r-=1
        return area
            