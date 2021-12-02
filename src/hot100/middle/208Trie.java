package hot100.middle;

/**
 * 构造数据结构，这个只能靠经验
 */
class Trie {

    private final Trie[] tries;
    private boolean isEnd;

    public Trie() {
        tries = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        int length = word.length();

        Trie tmp = this;
        for (int i = 0; i < length; i++) {
            int index = word.charAt(i) - 'a';
            if (tmp.tries[index] == null) {
                tmp.tries[index] = new Trie();
            }
            tmp = tmp.tries[index];
        }
        tmp.isEnd = true;
    }

    public boolean search(String word) {
        Trie finalNode = searchWordTree(word);
        return finalNode != null && finalNode.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchWordTree(prefix) != null;
    }

    private Trie searchWordTree(String word) {
        int length = word.length();

        Trie tmp = this;
        for (int i = 0; i < length; i++) {
            int index = word.charAt(i) - 'a';
            if (tmp.tries[index] != null) {
                tmp = tmp.tries[index];
            } else {
                return null;
            }
        }

        return tmp;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */