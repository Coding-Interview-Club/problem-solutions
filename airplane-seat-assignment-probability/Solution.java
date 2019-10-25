// Airplane Seat Assignment Probability
// Leetcode problem 1227
// https://leetcode.com/problems/airplane-seat-assignment-probability/

// The probability of the problem can be represented by the following expressions:
// nthPersonGetsNthSeat(1) = 1
// nthPersonGetsNthSeat(n) = 1/n + (n-2) / n * nthPersonGetsNthSeat(n - 1) for n >= 2

// The expression above evaluates to 1/2 for all n >= 2
// Proved via mathematical induction:
// https://en.wikipedia.org/wiki/Mathematical_induction

// First prove that it works for the base case, n = 2.
// 1/2 + (2-2)/n * 1 == 1/2, so it the base case holds!
// Then nthPersonGetsNthSeat(2) = 1/2

// Then think of this base case as k, then nthPersonGetsNthSeat(k) = 1/2
// Then you must prove that nthPersonGetsNthSeat(k + 1) = 1/2
// The rest of the proof is left as a fun exercise to the reader :D
class Solution {
    public double nthPersonGetsNthSeat(int n) {
        return (n == 1) ? 1.0 : 0.5;
    }
}