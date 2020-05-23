class Solution {
    public String minWindow(String s, String t) {
        int size = s.length();
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, length = size + 1;
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char temp = t.charAt(i);
            need.put(temp, need.getOrDefault(temp, 0) + 1);
        }

        while (right < size) {
            char curr = s.charAt(right);
            right++;
            if (need.containsKey(curr)) {
                window.put(curr, window.getOrDefault(curr, 0) + 1);
                if (need.get(curr).equals(window.get(curr))) {
                    valid++;
                }
            }
            
            while (valid == need.size()) {
                if (right - left < length) {
                    start = left;
                    length = right - left;
                }

                char leftChar = s.charAt(left);
                left++;
                if (need.containsKey(leftChar)) {
                    if (need.get(leftChar).equals(window.get(leftChar))) {
                        valid--;
                    }
                    window.put(leftChar, window.get(leftChar) - 1);
                }
            }
        }

        return (length == size + 1) ? "" : s.substring(start, start + length);
    }
}