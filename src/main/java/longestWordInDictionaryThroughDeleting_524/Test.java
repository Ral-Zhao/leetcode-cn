package longestWordInDictionaryThroughDeleting_524;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = Lists.newArrayList("ale", "apple", "monkey", "plea");
        Assert.assertEquals("apple",solution.findLongestWord("abpcplea", list));
        list = Lists.newArrayList("a", "b", "c");
        Assert.assertEquals("a",solution.findLongestWord("abpcplea", list));
        list = Lists.newArrayList("abe", "abc");
        Assert.assertEquals("abc",solution.findLongestWord("abce", list));
        list = Lists.newArrayList("ale", "apple", "monkey", "plea", "abpcplaaa", "abpcllllll", "abccclllpppeeaaaa");
        Assert.assertEquals("apple", solution.findLongestWord("abpcplea", list));
    }
}

