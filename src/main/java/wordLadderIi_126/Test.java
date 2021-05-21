package wordLadderIi_126;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> wordList = Lists.newArrayList("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> result = null;
        result = solution.findLadders("hit", "cog", wordList);
        System.out.println(JSON.toJSONString(result));
        wordList = Lists.newArrayList("si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye");
        result = solution.findLadders("qa", "sq", wordList);
        System.out.println(JSON.toJSONString(result));
        wordList = Lists.newArrayList("a", "b", "c");
        result = solution.findLadders("a", "c", wordList);
        System.out.println(JSON.toJSONString(result));
        wordList = Lists.newArrayList("hot", "dog");
        result = solution.findLadders("hot", "dog", wordList);
        System.out.println(JSON.toJSONString(result));
        wordList = Lists.newArrayList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee");
        result = solution.findLadders("red", "tax", wordList);
        System.out.println(JSON.toJSONString(result));//[["red","ted","tad","tax"],["red","ted","tex","tax"],["red","rex","tex","tax"]]
    }
}
