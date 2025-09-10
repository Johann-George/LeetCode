class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(int[] arr:intervals){
            list.add(arr);
        }
        list.sort((a,b)-> a[1]-b[1]);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)[0]);
        }
        System.out.println(list.size());
        List<int[]> newList = new ArrayList<>();
        for(int[] arr1:list){
            if(newList.isEmpty() || arr1[0]>=newList.get(newList.size()-1)[1]){
                newList.add(arr1);
            }
            
        }
        System.out.println(newList.size());
        return (list.size()-newList.size());
    }
}