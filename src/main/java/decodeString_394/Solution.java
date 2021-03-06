package decodeString_394;

import java.util.Stack;

/**
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * <p>
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * 示例 2：
 * <p>
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * 示例 3：
 * <p>
 * 输入：s = "2[abc]3[cd]ef"
 * 输出："abcabccdcdcdef"
 * 示例 4：
 * <p>
 * 输入：s = "abc3[cd]xyz"
 * 输出："abccdcdcdxyz"
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String temp = "";
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                n = n * 10 + (ch - '0');
            } else if (ch == '[') {
                strStack.push(temp);
                numberStack.push(n);
                temp = "";
                n = 0;
            } else if (ch == ']') {
                int num = numberStack.pop();
                StringBuilder stringBuilder = new StringBuilder();
                while (num-- > 0) {
                    stringBuilder.append(temp);
                }
                if (numberStack.isEmpty()) {
                    sb.append(stringBuilder.toString());
                    temp = "";
                } else {
                    temp = stringBuilder.insert(0, strStack.pop()).toString();
                }
            } else {
                if (numberStack.isEmpty()) {
                    sb.append(ch);
                } else {
                    temp = temp + ch;
                }
            }
        }
        return sb.toString();
    }

    public String decodeString_best(String s) {

        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String string = "";
                while (!stack.peek().equals("[")) {
                    string = stack.pop() + string;
                }
                stack.pop();

                String countString = "";
                while ((!stack.isEmpty()) && (stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9')) {
                    countString = stack.pop() + countString;
                }
                int count = Integer.parseInt(countString);

                String retString = "";
                for (int j = 0; j < count; j++) {
                    retString = retString + string;
                }
                stack.push(retString);
            } else {
                String str = "" + s.charAt(i);
                stack.push(str);
            }
        }

        String aaa = "";
        while (!stack.isEmpty()) {
            aaa = stack.pop() + aaa;
        }
        return aaa;
    }
}
