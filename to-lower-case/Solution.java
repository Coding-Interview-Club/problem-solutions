// To Lower Case
// Leetcode problem 709
// https://leetcode.com/problems/to-lower-case/

class Solution {
    public String toLowerCase(String str) {
        String out = "";
        for(int i = 0; i < str.length(); i++)
            if(isUppercase(str.charAt(i)))
               out += (char)(str.charAt(i) + 32);
            else out += str.charAt(i);
        return out;
    }
    
    private static boolean isUppercase(char c) {
        return c >= 65 && c <= 90;
    }
}