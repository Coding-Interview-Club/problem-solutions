// Add to Array-Form of Integer
// Leetcode problem 989
// https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List out = new ArrayList<Integer>();
        int carry = 0, i = A.length - 1;

        // While there are still entries in A.
        while(i >= 0){
            out.add(0, (A[i] + K % 10 + carry) % 10);
            carry = (A[i--] + K % 10 + carry) / 10;
            K /= 10;
        }
        // While there are still digits in K.
        while(K > 0){
            out.add(0, (K % 10 + carry) % 10);
            carry = (K % 10 + carry) / 10;
            K /= 10;
        }

        if(carry != 0){
            out.add(0, carry);
        }
        return out;
    }
}