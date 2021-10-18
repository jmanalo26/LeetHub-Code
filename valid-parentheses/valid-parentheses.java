class Solution {
    public boolean isValid(String s) {
        boolean valid = true; 
        Stack<Character> stack = new Stack<Character>();
        char[] ch = s.toCharArray();
        if (ch.length % 2 != 0)
            return false;
        for (char c: ch){
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || c != stack.pop()){
                valid = false;
            }
        }
        
        if (!stack.isEmpty())
            valid = false;
        
        return valid;
    }
}