class Solution {
    public int[] set = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) {
            set[i] = -1;
        }

        List<int[]> unEquals = new ArrayList<>();
        for (String s : equations) {
            if (s.charAt(1) == '=') {
                union(s.charAt(0) - 'a', s.charAt(3) - 'a');
            } else {
                unEquals.add(new int[]{s.charAt(0) - 'a', s.charAt(3) - 'a'});
            }
        }

        for (int[] eq : unEquals) {
            if (findRoot(eq[0]) == findRoot(eq[1])) {
                return false;
            }
        }
        return true;
    }

    public void union(int a, int b) {
        int aRoot = findRoot(a);
        int bRoot = findRoot(b);
        if (aRoot == bRoot) {
            return;
        }
        set[aRoot] = bRoot;
    }

    public int findRoot(int x) {
        while (set[x] != -1) {
            x = set[x];
        }
        return x;
    }
}