class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer> sMap = new HashMap<>();
        int l=0,minLen=Integer.MAX_VALUE;
        int[] res = {-1,-1};
        int have = 0, need = tMap.size();
        for(int r=0;r<s.length();r++){
            sMap.put(s.charAt(r),sMap.getOrDefault(s.charAt(r),0)+1);
            if(tMap.containsKey(s.charAt(r)) && sMap.get(s.charAt(r)).equals(tMap.get(s.charAt(r)))){
                have++;
            }

            while(have == need){
                if(r-l+1<minLen){
                    minLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }

                char charLeft = s.charAt(l);
                sMap.put(charLeft,sMap.get(charLeft)-1);
                if(tMap.containsKey(charLeft) && sMap.get(charLeft)<tMap.get(charLeft)){
                    have--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(res[0],res[1]+1);
    }
}