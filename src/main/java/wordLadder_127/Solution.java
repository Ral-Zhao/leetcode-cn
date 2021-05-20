package wordLadder_127;

import java.util.*;

/**
 * 字典 wordList 中从单词 beginWord 和 endWord 的 转换序列 是一个按下述规格形成的序列：
 * <p>
 * 序列中第一个单词是 beginWord 。
 * 序列中最后一个单词是 endWord 。
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典 wordList 中的单词。
 * 给你两个单词 beginWord 和 endWord 和一个字典 wordList ，找到从 beginWord 到 endWord 的 最短转换序列 中的 单词数目 。
 * 如果不存在这样的转换序列，返回 0。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出：5
 * 解释：一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog", 返回它的长度 5。
 * 示例 2：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * 输出：0
 * 解释：endWord "cog" 不在字典中，所以无法进行转换。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= beginWord.length <= 10
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord、endWord 和 wordList[i] 由小写英文字母组成
 * beginWord != endWord
 * wordList 中的所有字符串 互不相同
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int step = 0;
        Queue<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        queue.add(beginWord);
        visited.add(beginWord);
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String src = queue.poll();
                for (String cand : wordList) {
                    if (src.equals(endWord)) {
                        return step;
                    }
                    if (visited.contains(cand)) {
                        continue;
                    }

                    if (canConvert(src, cand)) {
                        queue.add(cand);
                        visited.add(cand);
                    }
                }
            }

        }
        return 0;
    }

    public int ladderLength_biBFS(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)){
            return 0;
        }
        int step = 0;
        Set<String> startVisited = new HashSet<>();
        Set<String> endVisited = new HashSet<>();
        Queue<String> startQueue = new ArrayDeque<>();
        Queue<String> endQueue = new ArrayDeque<>();
        startVisited.add(beginWord);
        startQueue.add(beginWord);
        endQueue.add(endWord);
        endVisited.add(endWord);
        while (!startQueue.isEmpty() && !endQueue.isEmpty()) {
            step++;
            if (visited(startQueue, startVisited, endVisited, wordList)) {
                return step * 2;
            }
            if (visited(endQueue,  endVisited, startVisited, wordList)) {
                return step * 2 + 1;
            }
        }

        return 0;
    }

    private boolean visited(Queue<String> queue,
                            Set<String> visited, Set<String> otherVisited, List<String> wordList) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            String src = queue.poll();
            for (String target : wordList) {

                if (visited.contains(target)||src.equals(target)) {
                    continue;
                }
                if (canConvert(src, target)) {
                    if (otherVisited.contains(target)) {
                        return true;
                    }
                    visited.add(target);
                    queue.add(target);

                }
            }
        }
        return false;
    }

    private boolean canConvert(String src, String target) {
        int count = 0;
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) != target.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
