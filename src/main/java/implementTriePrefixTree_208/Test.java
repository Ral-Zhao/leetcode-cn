package implementTriePrefixTree_208;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));
        Assert.assertTrue(!trie.search("app"));
        Assert.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));

    }
}
