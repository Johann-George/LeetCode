class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxCount = 0;
        
        for(Integer num: set){
            
            if(!set.contains(num-1)){
                int count = 1;
                int currentNum = num;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum+=1;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}