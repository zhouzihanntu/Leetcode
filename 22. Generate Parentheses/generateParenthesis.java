class generateParenthesis {
    List<String> res = new ArrayList<String>();
    public List<String> solution(int n) {
        dfs(n, n, "");
        return res;
    }

    public void dfs(int left, int right, String str) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left > 0) {
            dfs(left - 1, right, str + "(");
        }
        if (right > left) {
            dfs(left, right - 1, str + ")");
        }
    }
}