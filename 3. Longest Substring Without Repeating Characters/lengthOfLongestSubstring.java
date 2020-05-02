class lengthOfLongestSubstring {
    public int solution(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        int left = 0, maxCnt = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (charMap.containsKey(s.charAt(i))) {
                left = Math.max(left, charMap.get(s.charAt(i)) + 1);
            }
            charMap.put(s.charAt(i), i);
            maxCnt = Math.max(maxCnt, i - left + 1);
        }
        return maxCnt;
    }
}