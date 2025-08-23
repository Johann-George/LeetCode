class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r=nums.length-1;
        while(l<r){
            int m = l+(r-l)/2;
            if(nums[m]>nums[r]){
                l=m+1;
            }
            else{
                r=m;
            }
        }
        int pivot = l;
        int result = binarySearch(nums, target, 0, pivot-1);
        if(result!=-1){
            return result;
        }

        return binarySearch(nums, target, pivot, nums.length-1);
    }

    public int binarySearch(int nums[], int target, int left, int right){
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        } 
        return -1;
    }
}