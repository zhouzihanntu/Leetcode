class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        if (left >= right) {
            return true;
        }
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left ++;
            right --;
        }
        return true;
    }

    public boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if(s.charAt(left) == s.charAt(right)) {
            return isPalindrome(s, left + 1, right - 1);
        }
        return false;
    }
}