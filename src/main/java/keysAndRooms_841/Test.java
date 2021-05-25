package keysAndRooms_841;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> room1 = Lists.newArrayList(1);
        List<Integer> room2 = Lists.newArrayList(2);
        List<Integer> room3 = Lists.newArrayList(3);
        List<Integer> room4 = Lists.newArrayList();
        List<List<Integer>> rooms = Lists.newArrayList(room1, room2, room3, room4);
        Assert.assertTrue(solution.canVisitAllRooms(rooms));
        room1 = Lists.newArrayList(1, 3);
        room2 = Lists.newArrayList(3, 0, 1);
        room3 = Lists.newArrayList(2);
        room4 = Lists.newArrayList(0);
        rooms = Lists.newArrayList(room1, room2, room3, room4);
        Assert.assertTrue(!solution.canVisitAllRooms(rooms));
    }
}
