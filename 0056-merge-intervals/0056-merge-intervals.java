class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int[][] res = new int[intervals.length][2];
        int l=0;
        res[0] = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(res[l][1]>=intervals[i][0]){
                res[l][1] = Math.max(res[l][1],intervals[i][1]);
            }
            else{
                l++;
                res[l] = intervals[i];
            }
            
        }
        return Arrays.copyOf(res,l+1);
    }
}