# 1-bit and 2-bit Characters
# Leetcode Problem 717
# https://leetcode.com/problems/1-bit-and-2-bit-characters/

class Solution(object):
    def isOneBitCharacter(self, bits):
        if len(bits) == 0:
            return False
        if len(bits) == 1:
            return bits[0] == 0
        if bits[0] == 0:
            return self.isOneBitCharacter(bits[1:])
        if len(bits) < 2:
            return False
        return self.isOneBitCharacter(bits[2:])