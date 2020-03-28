import java.util.Arrays;
class minimumLengthEncoding {

    public int solution(String[] words) {
        int n = 0;
        Trie t = new Trie();
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        for (String word: words) {
            n = n + t.insert(word);
        }
        return n;
    }

    public static void main(String[] argv) {
    	minimumLengthEncoding obj = new minimumLengthEncoding();
    	String[] words = {"time", "me", "bell"};
    	int res = obj.solution(words);
        System.out.println(res);
    }
}

class TrieNode {
	char val;
	TrieNode[] children = new TrieNode[26];
	public TrieNode() {}
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public int insert(String word) {
        TrieNode p = root;
        boolean isNew = false;
        for (int i = word.length()-1; i >=0; i--) {
            int c = word.charAt(i) - 'a';
            if (p.children[c] == null) {
                isNew = true;
                p.children[c] = new TrieNode();
            }
            p = p.children[c];
        }
        return isNew ? word.length() + 1 : 0;
    }

}
