class merge {
    public int[][] solution(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] i: intervals) {
            if (idx == -1 || i[0] > res[idx][1]) {
                res[++idx] = i;
            } else {
                res[idx][1] = Math.max(res[idx][1], i[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}