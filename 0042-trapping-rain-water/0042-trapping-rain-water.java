class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1, res=0;
        int leftMax = height[l], rightMax = height[r];
        while(l<r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                res += leftMax - height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}