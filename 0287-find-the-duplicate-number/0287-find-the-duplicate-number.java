class Solution {
    public int findDuplicate(int[] nums) {
        for(int num : nums){
            int idx = Math.abs(num) - 1; 
            if(nums[idx] < 0){
                return Math.abs(idx)+1;
            }
            nums[idx] *= -1;
        }
        return -1;
    }
}