class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p = Math.max(p1, p2) + 1;
        char[] s = new char[p + 1];
        while (p1 >= 0 && p2 >= 0) {
            int x = arr1[p1] - '0';
            int y = arr2[p2] - '0';
            int sum = x + y + carry;
            if (sum > 1) {
                carry = 1;
                s[p] = (char)('0' + (sum % 2));
            } else {
                carry = 0;
                s[p] = (char)('0' + sum);
            }
            p1--;
            p2--;
            p--;
        }
        while (p1 >= 0) {
            int x = arr1[p1] - '0';
            int sum = x + carry;
            if (sum > 1) {
                carry = 1;
                s[p] = (char)('0' + (sum % 2));
            } else {
                carry = 0;
                s[p] = (char)('0' + sum);
            }
            p1--;
            p--;
        }
        while (p2 >= 0) {
            int x = arr2[p2] - '0';
            int sum = x + carry;
            if (sum > 1) {
                carry = 1;
                s[p] = (char)('0' + (sum % 2));
            } else {
                carry = 0;
                s[p] = (char)('0' + sum);
            }
            p2--;
            p--;
        }
        if (carry > 0) {
            s[p] = (char)('0' + carry);
            return String.valueOf(s);
        } else {
            return String.valueOf(Arrays.copyOfRange(s, 1, s.length));
        }

    }
}