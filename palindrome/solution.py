def is_palindrome(s):
    return all(s[i] == s[len(s) - 1 - i] for i in range(len(s) // 2))
