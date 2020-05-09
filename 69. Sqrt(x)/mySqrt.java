class mySqrt {
    public int solution(int x) {
        long left = 0, right = (x / 2) + 1;
        if (x == 0) {
            return 0;
        }
        while (left < right) {
            long mid = left + (right - left + 1) / 2;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        return (int) left;
    }
}