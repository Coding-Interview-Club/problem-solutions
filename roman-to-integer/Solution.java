// Roman to Integer
// Leetcode problem 13
// https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int out = 0;
        if(s.length()==1) return charToInt(s.charAt(0));
        for(int i = 0; i < s.length()-1; i++){
          if(charToInt(s.charAt(i))>=charToInt(s.charAt(i+1))){
            out += charToInt(s.charAt(i));
          }else{
            out -= charToInt(s.charAt(i));
          }
        }
        out += charToInt(s.charAt(s.length()-1));
        return out;
    }

    // In-memory hashmap is avoided via switch
    // statement method.
    public int charToInt(char c){
        int out;
        switch(c){
          case 'I': out = 1; break;
          case 'V': out = 5; break;
          case 'X': out = 10; break;
          case 'L': out = 50; break;
          case 'C': out = 100; break;
          case 'D': out = 500; break;
          case 'M': out = 1000; break;
          default: out = 0; break;
        }
        return out;
      }
}