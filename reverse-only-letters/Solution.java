// Reverse Only Letters
// Leetcode problem 917
// https://leetcode.com/problems/reverse-only-letters/

class Solution {
    public String reverseOnlyLetters(String S) {
        char[] out = new char[S.length()];
        // Moving the invalid characters to freshly
        // allocated array.
        for(int i = 0; i < S.length(); i++)
            if(!isValid(S.charAt(i)))
                out[i] = S.charAt(i);
        
        int r = out.length - 1;
        for(int l = 0; l < S.length(); l++){
            // Finding the next valid character.
            while(l < S.length() && !isValid(S.charAt(l)))
                l++;
            // Finding the next available slot in the
            // output array.
            while(r >= 0 && out[r] != 0)
                r--;
            // Putting the next valid character in
            // next free slot.
            if(l < S.length() && r >= 0)
                out[r] = S.charAt(l);
        }
        return new String(out); 
    }
    
    private static boolean isValid(char c){
        return Character.isLetter(c);
    }
}