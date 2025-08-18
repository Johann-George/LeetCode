class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(Character c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        if(str.toString().equals(str.reverse().toString())) return true;
        else return false;
    }
}