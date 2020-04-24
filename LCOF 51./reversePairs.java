class reversePairs {
    int count = 0;
    
    public void merge(int[] nums, int start, int mid, int end, List<Integer> temp) {
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i ++;
            }
            else {
                count = count + mid - i + 1;
                temp.add(nums[j]);
                j ++;
            }
        }
        while (i <= mid) {
            temp.add(nums[i]);
            i ++;
        }
        while (j <= end) {
            temp.add(nums[j]);
            j ++;
        }
        for (int k = 0; k < temp.size(); k ++) {
            nums[start + k] = temp.get(k);
        }
        temp.clear();
    }
    
    public void mergeSort(int[] nums, int start, int end, List<Integer> temp) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid, temp);
        mergeSort(nums, mid + 1, end, temp);
        merge(nums, start, mid, end, temp);
    }

    public int solution(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        mergeSort(nums, 0, nums.length - 1, temp);
        return count;
    }
}