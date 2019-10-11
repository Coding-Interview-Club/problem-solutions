// Add Digits
// Leetcode problem 258
// https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        if(sum < 10)
            return sum;
        return addDigits(sum);
    }
}