// DI string Match
// Leetcode problem 942
// https://leetcode.com/problems/di-string-match/

class Solution {
    public int[] diStringMatch(String S) {
        int[] nums = new int[S.length() + 1];
        int min = 0, max = S.length();
        
        for(int i = 0; i < S.length(); i++)
            if(S.charAt(i) == 'D')
                nums[i] = max--;
            else
                nums[i] = min++;
        
        nums[S.length()] = max;
        return nums;    
    }
}