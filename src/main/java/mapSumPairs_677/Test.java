package mapSumPairs_677;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        Assert.assertEquals(3, mapSum.sum("app"));
        mapSum.insert("app", 2);
        Assert.assertEquals(5, mapSum.sum("ap"));
        mapSum.insert("aptx", 4);
        Assert.assertEquals(9, mapSum.sum("ap"));
        Assert.assertEquals(4, mapSum.sum("apt"));
    }
}
