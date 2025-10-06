class Solution {
    private StringBuilder temp = new StringBuilder();
    private List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        diff("", 0, 0, n);
        return res;
    }

    public void diff(String temp, int open, int close, int n){
        if(temp.length() == 2*n ){
            res.add(temp);
            return;
        }
        if(open < n){
            diff(temp + "(", open + 1, close, n);
        }
        if(close < open){
            diff(temp + ")", open, close + 1, n);
        }
    }
}