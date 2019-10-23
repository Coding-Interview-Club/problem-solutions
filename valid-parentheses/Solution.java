// Valid Parentheses
// Leetcode Problem 20
// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c: s.toCharArray())
            if(c == '(')
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else if(c == '{')
                stack.push('}');
            else if(stack.empty() || c != stack.peek())
                return false;
            else stack.pop();
        
        return stack.empty();
    }
}