class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBanana = 0;
        for(int i=0;i<piles.length;i++){
            maxBanana = Math.max(maxBanana,piles[i]);
        }
        int l=0,r=maxBanana,res=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            long totalHours = 0;
            for(int p:piles){
                totalHours += Math.ceil((double)p/mid);
            }
            if(totalHours<=h){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }

        }
        return res;
    }
}