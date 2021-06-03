package wordSearchIi_212;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = new String[]{"oath", "pea", "eat", "rain"};
        char[][] board = new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        List<String> result;
        result = solution.findWords(board, words);
        System.out.println(JSON.toJSONString(result));
        words = new String[]{"abcd"};
        board = new char[][]{{'a', 'b'}, {'c', 'd'}};
        result = solution.findWords(board, words);
        System.out.println(JSON.toJSONString(result));
        words = new String[]{"oa", "oaa"};
        board = new char[][]{{'o', 'a', 'b', 'n'}, {'o', 't', 'a', 'e'}, {'a', 'h', 'k', 'r'}, {'a', 'f', 'l', 'v'}};
        result = solution.findWords(board, words);
        System.out.println(JSON.toJSONString(result));
    }
}
