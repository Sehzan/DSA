package com.hitech.leetcode;

class Leetcode125ValidPalindromeString{
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            while (left < right && !isAlphaNum(l)) {
                l = s.charAt(++left);
            }

            while (left < right && !isAlphaNum(r)) {
                r = s.charAt(--right);
            }

            if (toLower(l) != toLower(r)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z')
            || (c >= 'A' && c <= 'Z')
            || (c >= '0' && c <= '9');
    }

    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }
    public static void main(String[] args) {
        Leetcode125ValidPalindromeString c = new Leetcode125ValidPalindromeString();
        System.out.println(c.isPalindrome("A man, a plan, a canal: Panama"));
    }
}