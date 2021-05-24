package minimumGeneticMutation_433;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] bank = new String[]{"AACCGGTA"};
        //Assert.assertEquals(1, solution.minMutation("AACCGGTT", "AACCGGTA", bank));
        bank = new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        Assert.assertEquals(2, solution.minMutation("AACCGGTT", "AAACGGTA", bank));
        bank = new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"};
        Assert.assertEquals(3, solution.minMutation("AAAAACCC", "AACCCCCC", bank));
    }
}
