class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int l = 0, r = intervals.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(intervals[mid][0]<newInterval[0]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

        List<int[]> list = new ArrayList<>();
        for(int i=0;i<l;i++){
            list.add(intervals[i]);
        }
        list.add(newInterval);
        for(int i=l;i<intervals.length;i++){
            list.add(intervals[i]);
        }

        List<int[]> merged = new ArrayList<>();
        for(int[] interval: list){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1]<interval[0]){
            merged.add(interval);
            }
            else{
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],interval[1]);
            }
        }
        return merged.toArray(new int[0][]);
        
    }
}