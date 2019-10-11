// Add Binary
// Leetcode problem 67
// https://leetcode.com/problems/add-binary/

class Solution{
    public static String addBinary(String a, String b){
        String out = "";
        int m = a.length() - 1, n = b.length() - 1;
        boolean carry = false;
        int currentSum = 0;

        while(m>=0||n>=0){
            if(m>=0&&a.charAt(m--) == '1') currentSum++;
            if(n>=0&&b.charAt(n--) == '1') currentSum++;
            if(carry) currentSum++;
        
            carry = currentSum > 1;
            out = currentSum % 2 + out;
            currentSum = 0;
        }

        if(carry) out = '1' + out;    
        return out;
    }
}
