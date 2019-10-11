// Robot Return to Origin
// Leetcode problem 657
// https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray())
            switch(c) {
                case 'R': x++; break;
                case 'L': x--; break;
                case 'U': y++; break;
                case 'D': y--; break;   
                default: break;
            }
        return x==0 && y==0;
    }
}