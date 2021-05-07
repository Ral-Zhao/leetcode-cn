package sortCharactersByFrequency_451;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "tree"
 * <p>
 * 输出:
 * "eert"
 * <p>
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 * 示例 2:
 * <p>
 * 输入:
 * "cccaaa"
 * <p>
 * 输出:
 * "cccaaa"
 * <p>
 * 解释:
 * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
 * 示例 3:
 * <p>
 * 输入:
 * "Aabb"
 * <p>
 * 输出:
 * "bbAa"
 * <p>
 * 解释:
 * 此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
 * 注意'A'和'a'被认为是两种不同的字符。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int num = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), num + 1);
        }
        Map.Entry<Character, Integer>[] sortArr = new Map.Entry[map.entrySet().size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (index == 0) {
                sortArr[index] = entry;
            } else {
                int pos = index;
                while (pos > 0) {
                    int parent = (pos - 1) / 2;
                    if (sortArr[parent].getValue() >= entry.getValue()) {
                        break;
                    }
                    sortArr[pos] = sortArr[parent];
                    pos = parent;
                }
                sortArr[pos] = entry;
            }
            index++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = sortArr.length - 1; i >= 0; i--) {
            Map.Entry<Character, Integer> entry = sortArr[0];
            for (int j = 0; j < entry.getValue(); j++) {
                sb.append(entry.getKey());
            }
            sortArr[0] = sortArr[i];

            int pos = 0;
            while (pos * 2 + 1 < i) {
                int left = pos * 2 + 1;
                int right = pos * 2 + 2;
                int maxChild = right >= i ? left : sortArr[left].getValue() > sortArr[right].getValue() ? left : right;
                if (sortArr[pos].getValue() < sortArr[maxChild].getValue()) {
                    Map.Entry<Character, Integer> temp = sortArr[pos];
                    sortArr[pos] = sortArr[maxChild];
                    sortArr[maxChild] = temp;
                }
                pos = maxChild;
            }
        }
        return sb.toString();
    }

}
