class singleNumbers {
    public int[] solution(int[] nums) {
        int min = 10001, max = 1, sum = 0, zeroCount = 0;
        for (int i: nums) {
            if (i == 0) {
                zeroCount ++;
            }
            min = Math.min(min, i);
            max = Math.max(max, i);
            sum = sum ^ i;
        }
        if (zeroCount == 1) {
            return new int[] {0, sum};
        }

        int low = min, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            int lowSum = 0, highSum = 0;
            for (int i: nums) {
                if (i <= mid) {
                    lowSum = lowSum ^ i;
                }
                else {
                    highSum = highSum ^ i;
                }
            }
            if (lowSum != 0 && highSum != 0) {
                return new int[]{lowSum, highSum};
            }
            if (lowSum == 0) {
                low = mid;
            }
            else {
                high = mid;
            }
        }

        return null;
    }
}