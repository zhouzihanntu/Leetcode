class Solution {
    public String decodeString(String s) {
        return dfs(s, 0)[0];
    }

    public String[] dfs(String s, int p) {
        StringBuilder res = new StringBuilder();
        int num = 0;
        while (p < s.length()) {
            char curr = s.charAt(p);
            if (curr >= '0' && curr <= '9') {
                num = num * 10 + (curr - '0');
            } else if (curr == '[') {
                String[] temp = dfs(s, p + 1);
                p = Integer.parseInt(temp[0]);
                while (num > 0) {
                    res.append(temp[1]);
                    num--;
                }
            } else if (curr == ']') {
                return new String[] {String.valueOf(p), res.toString()};
            } else {
                res.append(String.valueOf(curr));
            }
            p++;
        }
        return new String[] {res.toString()};
    }
}