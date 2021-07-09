package wordBreak_139;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> wordDict = Lists.newArrayList("leet", "code");
        Assert.assertTrue(solution.wordBreak("leetcode", wordDict));
        wordDict = Lists.newArrayList("apple", "pen");
        Assert.assertTrue(solution.wordBreak("applepenapple", wordDict));
        wordDict = Lists.newArrayList("cats", "dog", "sand", "and", "cat");
        Assert.assertTrue(!solution.wordBreak("catsandog", wordDict));
    }
}
