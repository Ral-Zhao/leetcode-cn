package palindromeLinkedList_234;

import common.ListNode;
import org.junit.Assert;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = ListNodeUtil.buildList(1);
        Assert.assertTrue(solution.isPalindrome(list));
        list = ListNodeUtil.buildList(1, 2);
        Assert.assertTrue(!solution.isPalindrome(list));
        list = ListNodeUtil.buildList(1, 2, 1);
        Assert.assertTrue(solution.isPalindrome(list));
        list = ListNodeUtil.buildList(1, 2, 3);
        Assert.assertTrue(!solution.isPalindrome(list));
        list = ListNodeUtil.buildList(1, 2, 2, 1);
        Assert.assertTrue(solution.isPalindrome(list));
    }
}
