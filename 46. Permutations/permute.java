class backTrack {
    List<List<Integer>> res = new LinkedList<>();

    public void solution(int[] nums, LinkedList<Integer> track) {
        if (nums.length == track.size()) {
            res.add(new LinkedList(track));
            return;
        }
        for (int i: nums) {
            if (track.contains(i)) {
                continue;
            }
            track.add(i);
            backTrack(nums, new LinkedList(track));
            track.removeLast();
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backTrack(nums, track);
        return res;
    }
}