class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(int[] arr:intervals){
            list.add(arr);
        }
        list.sort((a,b)-> a[1]-b[1]);

        List<int[]> newList = new ArrayList<>();
        for(int[] arr1:list){
            if(newList.isEmpty() || arr1[0]>=newList.get(newList.size()-1)[1]){
                newList.add(arr1);
            }
            
        }
        return (list.size()-newList.size());
    }
}