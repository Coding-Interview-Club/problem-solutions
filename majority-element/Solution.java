// Majority Element
// Leetcode Problem 169
// https://leetcode.com/problems/majority-element/

class Solution {

    // Implementation of the Boyer-Moore voting algorithm.
    // https://en.wikipedia.org/wiki/Boyer–Moore_majority_vote_algorithm
    public int majorityElement(int[] nums) {
        int current_majority = nums[0];
        int current_times = 0;
        for(int i = 0; i < nums.length; i++){
            if(current_times <= 0){
                current_majority = nums[i];
                current_times++;
            }else if(nums[i] == current_majority){
                current_times++; // Vote for
            }else {
                current_times--; // Vote against
            }
        }
        return current_majority;
    }
}