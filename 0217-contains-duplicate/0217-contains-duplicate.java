class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while(i<nums.length){
            set.add(nums[i]);
            i++;
        }
        System.out.println(set.size());
        System.out.println(nums.length);
        if(set.size()==nums.length) return false;
        else return true;
    }
}