class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        for(int num: nums){
            map.put(num,i++);
        }
        i=0;
        for(int num: nums){
            if(map.containsKey(target-num) && (map.get(target-num)!=i)){
                return new int[]{i,map.get(target-num)};
            }
            i++;
        }
        return null;
    }
}