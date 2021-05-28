package cutOffTreesForGolfEvent_675;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //[[1,2,3],[0,0,4],[7,6,5]]
        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        List<Integer> list2 = Lists.newArrayList(0, 0, 4);
        List<Integer> list3 = Lists.newArrayList(7, 6, 5);
        List<List<Integer>> forest = Lists.newArrayList(list1, list2, list3);
        Assert.assertEquals(6, solution.cutOffTree(forest));
        //[[1,2,3],[0,0,0],[7,6,5]]
        list1 = Lists.newArrayList(1, 2, 3);
        list2 = Lists.newArrayList(0, 0, 0);
        list3 = Lists.newArrayList(7, 6, 5);
        forest = Lists.newArrayList(list1, list2, list3);
        Assert.assertEquals(-1, solution.cutOffTree(forest));
        //[[2,3,4],[0,0,5],[8,7,6]]
        list1 = Lists.newArrayList(2, 3, 4);
        list2 = Lists.newArrayList(0, 0, 5);
        list3 = Lists.newArrayList(8, 7, 6);
        forest = Lists.newArrayList(list1, list2, list3);
        Assert.assertEquals(6, solution.cutOffTree(forest));
        //[[4,2,3],[0,0,1],[7,6,5]]
        list1 = Lists.newArrayList(4, 2, 3);
        list2 = Lists.newArrayList(0, 0, 1);
        list3 = Lists.newArrayList(7, 6, 5);
        forest = Lists.newArrayList(list1, list2, list3);
        Assert.assertEquals(10, solution.cutOffTree(forest));
    }
}
