class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = String.valueOf(x);
        int left = 0, right = xStr.length() - 1;
        while (left < right) {
            if (xStr.charAt(left) != xStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}