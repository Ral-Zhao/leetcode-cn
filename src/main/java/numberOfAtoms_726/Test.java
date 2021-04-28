package numberOfAtoms_726;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals("K4N2O14S4",solution.countOfAtoms("K4(ON(SO3)2)2"));
        Assert.assertEquals("H2MgO2",solution.countOfAtoms("Mg(OH)2"));
        Assert.assertEquals("H2O",solution.countOfAtoms("H2O"));
        Assert.assertEquals("H",solution.countOfAtoms("(H)"));
    }
}
