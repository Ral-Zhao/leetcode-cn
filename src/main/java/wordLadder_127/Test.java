package wordLadder_127;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> wordList = Lists.newArrayList("hot", "dot", "dog", "lot", "log", "cog");
        Assert.assertEquals(5, solution.ladderLength_biBFS("hit", "cog", wordList));
        wordList = Lists.newArrayList("hot", "dot", "dog", "lot", "log");
        Assert.assertEquals(0, solution.ladderLength_biBFS("hit", "cog", wordList));
    }
}
