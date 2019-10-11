// Valid Palindrome
// Leetcode Problem 125
// https://leetcode.com/problems/valid-palindrome/

class Solution{
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while(l<r){
            if(!isAlphanumeric(s.charAt(l))){l++; continue;}
            if(!isAlphanumeric(s.charAt(r))){r--; continue;}
            if(s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static boolean isAlphanumeric(char c){
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9');
    }
}
