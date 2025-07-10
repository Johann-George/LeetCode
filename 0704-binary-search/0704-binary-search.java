class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    private int binarySearch(int[] nums, int target, int l, int r){
        if(l>r){
            return -1;
        }
        int mid = (l+r)/2;
        if(target==nums[mid]){
            return mid;
        }
        else if(target<nums[mid]){
            return binarySearch(nums,target,l,mid-1);
        }
        else{
            return binarySearch(nums,target,mid+1,r);
        }
    }
}