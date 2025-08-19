class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int maxArea = 0;
        while(l<r){
            if(height[l]<height[r]){
                maxArea = Math.max(maxArea,height[l]*(r-l));
                l++;
            }
            else if(height[l]>height[r]){
                maxArea = Math.max(maxArea, height[r]*(r-l));
                r--;
            }
            else{
                maxArea = Math.max(maxArea, height[r]*(r-l));
                l++;
                r--;
            }
        }
        return maxArea;
    }
}