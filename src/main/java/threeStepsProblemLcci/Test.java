package threeStepsProblemLcci;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(13, solution.waysToStep(5));
        Assert.assertEquals(13, solution.waysToStep(61));
    }
}
