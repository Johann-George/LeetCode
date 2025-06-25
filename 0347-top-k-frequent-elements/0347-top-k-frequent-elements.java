class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((e1,e2)-> {
            return e2.getValue() - e1.getValue();
        });
        int[] arr = new int[k];
        for(int j=0;j<k;j++){
            arr[j]=entries.get(j).getKey();
        }
        return arr;
    }
}