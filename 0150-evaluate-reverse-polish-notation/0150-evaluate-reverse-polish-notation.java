class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c: tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int i = 0;
                List<Integer> temp = new ArrayList<>();
                while(i!=2){
                    temp.add(stack.pop());
                    i++;
                }
                int res = 0;
                if(c.equals("+")){
                    res = temp.get(1) + temp.get(0);
                }
                else if (c.equals("-")){
                    res = temp.get(1) - temp.get(0);
                }
                else if(c.equals("*")){
                    res = temp.get(1) * temp.get(0);
                }
                else{
                    res = temp.get(1) / temp.get(0);
                }
                stack.push(res);
            }
            else{
                stack.push(Integer.valueOf(c));
            }
        }
        return stack.get(0);
    }
}