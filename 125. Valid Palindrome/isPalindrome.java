class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        char[] s1 = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                s1[idx] = s.charAt(i);
                idx++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                int c = s.charAt(i) - 'A';
                s1[idx] = (char)(c + 97);
                idx++;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                s1[idx] = s.charAt(i);
                idx++;
            }
        }

        int left = 0;
        int right = idx - 1;
        while (left < right) {
            if (s1[left] != s1[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}