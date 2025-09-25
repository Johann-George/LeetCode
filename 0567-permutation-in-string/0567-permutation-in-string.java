class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        int match = 0;
        for(int j=0;j<26;j++){
            if(count1[j] == count2[j]){
                match++;
            }
        }
        int index = 0;
        int l = 0;
        for(int r=s1.length();r<s2.length();r++){
            if(match == 26){
                return true;
            }
            index = s2.charAt(r) - 'a';
            count2[index]++;
            if(count1[index] == count2[index]){
                match++;
            }
            else if(count1[index]+1 == count2[index]){
                match--;
            }

            index = s2.charAt(l) - 'a';
            count2[index]--;
            if(count1[index] == count2[index]){
                match++;
            }
            else if(count1[index]-1 == count2[index]){
                match--;
            }
            l++;
        }
        return match == 26;
    }
}