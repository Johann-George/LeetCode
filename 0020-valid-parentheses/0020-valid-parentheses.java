class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        char c;
        char c1;
        char[] cstr = s.toCharArray();
        for(int i=0;i<cstr.length;i++){
            c = cstr[i];
            if(c==')' && !stack.isEmpty()){
                c1 = stack.pop();
                if(c1 != map.get(')')) return false;
            }
            else if(c=='}' && !stack.isEmpty()){
                c1 = stack.pop();
                if(c1 != map.get('}')) return false;
            }
            else if(c==']' && !stack.isEmpty()){
                c1 = stack.pop();
                if(c1 != map.get(']')) return false;
            }
            else stack.push(c);
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}