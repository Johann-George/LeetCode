class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxVal=0,temp=0;
        HashSet<Character> hs = new HashSet<>();
        char[] c = s.toCharArray();
        while(l<=r && r<c.length){
            if(!hs.contains(c[r])){
                hs.add(c[r]);
                temp = r-l+1;
                maxVal = Math.max(maxVal,temp);
                r++;
            }
            else{
                hs.remove(c[l]);
                l++;
            }
            
        }
        return maxVal;
    }
}