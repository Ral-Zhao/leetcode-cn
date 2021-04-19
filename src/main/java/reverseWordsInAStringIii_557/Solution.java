package reverseWordsInAStringIii_557;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *  
 * <p>
 * 提示：
 * <p>
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String reverseWords(String s) {
        char[] charArr = s.toCharArray();
        int left = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (i == charArr.length - 1 || charArr[i + 1] == ' ') {
                int right = i;
                while (left < right) {
                    char temp = charArr[left];
                    charArr[left] = charArr[right];
                    charArr[right] = temp;
                    left++;
                    right--;
                }
                left = i + 2;
            }
        }
        return new String(charArr);
    }
}
