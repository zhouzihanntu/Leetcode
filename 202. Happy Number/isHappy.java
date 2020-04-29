class isHappy {
    public boolean solution(int n) {
        Set<Integer> happySet = new HashSet();
        while (n != 1) {
            if (!happySet.add(n)) {
                break;
            }
            int happySum = 0;
            while (n > 0) {
                happySum = happySum + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = happySum;
        }
        return n == 1 ? true : false;
    }
}