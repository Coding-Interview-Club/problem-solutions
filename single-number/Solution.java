// Single Number
// Leetcode Problem 136
// https://leetcode.com/problems/single-number/

class Solution{
    public static int singleNumber(int[] nums){
        int out = 0;
        for(int x: nums)
            out ^= x;
        return out;
    }
}