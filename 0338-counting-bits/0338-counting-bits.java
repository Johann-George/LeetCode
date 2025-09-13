class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=0;j<32;j++){
                if((i & (1<<j))!=0){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}