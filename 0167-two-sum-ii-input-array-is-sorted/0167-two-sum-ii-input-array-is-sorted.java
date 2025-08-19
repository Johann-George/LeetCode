class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            int num2 = target-numbers[i];
            if(map.containsKey(num2) && i!=map.get(num2)){
                return new int[]{i+1,map.get(num2)+1};
            }
        }
        return null;
    }
}